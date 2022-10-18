package com.gofortrainings.capstone.core.models;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gofortrainings.capstone.core.services.TrendingArticleService;

/**
 * @author Arvind
 * Getting youtube video url  from jcr node.By the  help "https://www.youtube.com/oembed"   findout the video json data.
 */
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class VideoPlayListModel {

    @ValueMapValue
    private String[] youTubeLinks;

    List<String> videoList;
    
    @Reference
    TrendingArticleService trendingArticleService;

    private static final Logger LOG = LoggerFactory.getLogger(VideoPlayListModel.class);

    /**
     * After getting youTubeLinks from jcr node cancat link with given url hit it and json response add to youTubeLinks variable.  
     */
    @PostConstruct
    public void init() {
        if (youTubeLinks != null) {
            videoList = new ArrayList<>();
            for (String youTubeURL : youTubeLinks) {
                try (CloseableHttpClient httpClient = HttpClients.createDefault()){
                    HttpGet finalRequest = new HttpGet(trendingArticleService.getCapstoneConfigration().youtubeUrl() + youTubeURL);
                    try(CloseableHttpResponse finalResponse = httpClient.execute(finalRequest)) {
                        HttpEntity entity = finalResponse.getEntity();
                        if (entity != null) {                           
                            JsonReader jsonReader = Json.createReader(new StringReader(EntityUtils.toString(entity)));
                            videoList.add(jsonReader.readObject().getString("html"));
                            jsonReader.close();
                        }
                        finalResponse.close();
                    }
                } catch (IOException e) {
                    LOG.error("Getting exception {}", e.getMessage());
                }
            }
        }
    }

    /**
     * @return  getter method for  videoList variable
     */
    public List<String> getVideoList() {
        return videoList;
    }
}