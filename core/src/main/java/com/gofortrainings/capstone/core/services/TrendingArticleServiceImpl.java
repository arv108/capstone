package com.gofortrainings.capstone.core.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gofortrainings.capstone.core.constents.Constant;
import com.gofortrainings.capstone.core.models.ArticleBannerModel;
import com.gofortrainings.capstone.core.util.CapstoneUtility;
import com.day.cq.search.PredicateGroup;
import com.day.cq.search.Query;
import com.day.cq.search.QueryBuilder;
import com.day.cq.search.result.Hit;
import com.day.cq.wcm.api.Page;


/**
 * @author Arvind
 * Getting Trending articles on basis of created date 
 */
@Component(immediate = true, service = TrendingArticleService.class)
@Designate(ocd =CapstoneConfigration.class)
public class TrendingArticleServiceImpl implements TrendingArticleService{
    
    private static final Logger LOG = LoggerFactory.getLogger(TrendingArticleServiceImpl.class);
    private static final String SUB_SERVICE_NAME = "capstone_service_user";
    
    CapstoneConfigration config;
    
    @Reference
    QueryBuilder queryBuilder;

    @Reference
    ResourceResolverFactory factory;
    
    /**
     *     To get list of articles which are created recently 
     *     based on jcr:createdDate of the page
     */
    @Override
    public List<ArticleBannerModel> getArticles() {
        
        List<ArticleBannerModel> trendingArticles = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put(ResourceResolverFactory.SUBSERVICE, SUB_SERVICE_NAME);  
        try(ResourceResolver resolver = factory.getServiceResourceResolver(map)){ 
            List<Hit> queryRes = getQueryResult(resolver);
            
            for (Hit hit : queryRes) {
                try {
                    Resource resource = hit.getResource();
                    Resource bannerResource = resolver.getResource(resource.getPath() + Constant.BANNER_ARTICLE_NODE_PATH);
                    Page articlePage = resource.adaptTo(Page.class);
                    ArticleBannerModel bannerArticleModel = bannerResource.adaptTo(ArticleBannerModel.class);
                    bannerArticleModel.setPageCreatedDate(CapstoneUtility.getFormattedDate(articlePage.getProperties().get("jcr:created", Date.class)));
                    trendingArticles.add(bannerArticleModel);
                } catch (RepositoryException e) {
                    LOG.error("Getting Exception while article pages {}", e.getMessage());
                }
            }                
        } catch (LoginException e1) {
            LOG.error("Getting LoginException  {}", e1.getMessage());
        } 
        return trendingArticles;
    }
    
    /**
     * Result the query result.
     */ 
    public List<Hit> getQueryResult(ResourceResolver resolver) {
        Map<String, String> predicators = new HashMap<>();
        predicators.put("type", "cq:Page");
        predicators.put("path", config.articlePagePath());
        predicators.put("orderby", "@jcr:content/jcr:created");
        predicators.put("orderby.sort","desc");
        Query query = queryBuilder.createQuery(PredicateGroup.create(predicators), resolver.adaptTo(Session.class));
        return query.getResult().getHits();
    }
    
    @Activate
    public void activate(CapstoneConfigration config) {
        this.config = config;
    }

    @Override
    public CapstoneConfigration getCapstoneConfigration() {
        
        return config;
    }
}
