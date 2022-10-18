package com.gofortrainings.capstone.core.services;

import java.util.List;

import org.apache.sling.api.resource.ResourceResolver;

import com.gofortrainings.capstone.core.models.ArticleBannerModel;

/**
 * @author Arvind
 * In interface declare two methods.
 */
public interface TrendingArticleService {
    
    public List<ArticleBannerModel> getArticles();
    
    public CapstoneConfigration getCapstoneConfigration();
    
}
