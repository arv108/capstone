package com.gofortrainings.capstone.core.models;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import com.gofortrainings.capstone.core.services.TrendingArticleService;

@Model(
        adaptables = Resource.class
        )
public class TrendingArticleModel {
    
    @OSGiService
    TrendingArticleService trendingArticleService;
    
    List<ArticleBannerModel> trendingArticles;
    
    /**
     * @update the object of trendingArticles
     */
    @PostConstruct
    public void init() {
        trendingArticles = trendingArticleService.getArticles();
    }
    
    /**
     * @return the object of trendingArticles
     */
    public List<ArticleBannerModel> getTrendingArticles() {
        return trendingArticles;
    }
}

