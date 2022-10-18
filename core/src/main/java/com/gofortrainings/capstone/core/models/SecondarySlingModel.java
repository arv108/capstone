package com.gofortrainings.capstone.core.models;


import org.apache.sling.api.resource.Resource;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

/**
 * @author Arvind
 *  Sling model class for Secondary header. Getting dialog value from jcr node and return it.
 */

@Model(
		adaptables = Resource.class,
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
		)
public class SecondarySlingModel {
	
	@ValueMapValue
	private String logo;
	
	@ValueMapValue
	private String[] languages;

	@ValueMapValue
	private boolean displayLanguages;

	/**
     * @return the logo value
     */
	public String getLogo() {
		return logo;
	}

	/**
     * @return the languages  value
     */
	public String[] getLanguages() {
		return languages;
	}

	/**
     * @return the displayLanguages value
     */
	public boolean getDisplayLanguages() {
		return displayLanguages;
	}	
}
