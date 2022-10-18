package com.gofortrainings.capstone.core.models;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import com.gofortrainings.capstone.core.constents.Constant;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;

/**
 * @author Arvind
 * HomeBannerModel class are mapped with the  banner-article component.
 *  read the value from node and return it and use in htl code.
 */
@Model (
        adaptables =  {
                    Resource.class,
                    SlingHttpServletRequest.class
                },
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
        )
public class HomeBannerModel {
    
    @ValueMapValue
    private String[] articleLinks;
    
    @ScriptVariable
    PageManager pageManager;
    
    @SlingObject
    ResourceResolver resolver;

    
    List<ArticleBannerModel> bannerArticles;
    
    /**
     *  After inject variable update  bannerArticle variable have object of ArticleBannerModel class
     */
    @PostConstruct
    public void init() {
        
        if(articleLinks !=null && articleLinks.length > 0) {
  
            bannerArticles= new ArrayList<>();          
            for(String path : articleLinks) {
               
                Page  articlePage=pageManager.getPage(path);
                SimpleDateFormat formatter=new SimpleDateFormat("EEE,dd MMMM yyyy");
                String createdDateStr=formatter.format(articlePage.getProperties().get("jcr:created", Date.class));
                Resource resource=resolver.getResource(path + Constant.BANNER_ARTICLE_NODE_PATH);
           
                if(resource!=null) {
                  
                    ArticleBannerModel bannerArticleModel=resource.adaptTo(ArticleBannerModel.class);
                    bannerArticleModel.setPageCreatedDate(createdDateStr);
                    bannerArticles.add(resource.adaptTo(ArticleBannerModel.class));
                    if(bannerArticles.size() >= 5) {
                        break;
                    }
                }           
            }
        }
    }

    /**
     *  getter method for articleLinks instance variable;
     */
    public String[] getArticleLinks() {
        return articleLinks;
    }

    /**
     *  getter method for bannerArticles instance variable;
     */
    public List<ArticleBannerModel> getBannerArticles() {
        return bannerArticles;
    }
      
}