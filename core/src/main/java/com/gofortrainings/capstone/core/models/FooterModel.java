package com.gofortrainings.capstone.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

/**
 * @author Arvind
 *  FooterModel class are mapped with the  footer component.
 *  read the value from node and return it and use in htl code.
 */
@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
        )
public class FooterModel {
    
    @ValueMapValue
    private String aboutText;
    
    @ValueMapValue
    private String[] footerLogo;

    public String getAboutText() {
        return aboutText;
    }

    public String[] getFooterLogo() {
        return footerLogo;
    }


}
