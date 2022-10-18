package com.gofortrainings.capstone.core.models;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
/**
 * @author Arvind
 * ArticleBannerModel class are mapped with the mapped with article-banner component.
 * Get the value from node and return it.
 */
@Model (adaptables =  Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ArticleBannerModel {
    
    @ValueMapValue
    private String bannerImage;
    
    @ValueMapValue
    private String bannerText;
    
    @ValueMapValue
    private String pageCreatedDate;

    public String getBannerImage() {
        return bannerImage;
    }

    public String getBannerText() {
        return bannerText;
    }

    public String getPageCreatedDate() {
        return pageCreatedDate;
    }

    /**
     * This methed are use for set pageCreated date in instance variable pageCreatedDate. 
     */
    public void setPageCreatedDate(String pageCreatedDate) {
        this.pageCreatedDate= pageCreatedDate;
    }
}
