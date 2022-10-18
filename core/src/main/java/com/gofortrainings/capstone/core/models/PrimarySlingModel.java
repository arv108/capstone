package com.gofortrainings.capstone.core.models;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

/**
 * @author Arvind
 *  Sling model class for primary header. Getting dialog value from jcr node and return it.
 */
@Model(
		adaptables = Resource.class
		)
public class PrimarySlingModel {
	
	@ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
	private String trendingText;
	

	@ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
	private String trendingDesc;
	
	private String curdate;
	
	/**
	 * return current date in time format dd mmm yyyy.
	 *
	 */
	@PostConstruct
	public void getDateStr() {
		SimpleDateFormat formatter =  new SimpleDateFormat("EEEE, dd MMM yyyy"); 
		curdate = formatter.format(new Date());
	}
	
	/**
	 * @return the trendingText value
	 */
	public String getTrendingText() {
		return trendingText;
	}

	/**
	 * @return trendingDesc value
	 */
	public String getTrendingDesc() {
		return trendingDesc;
	}

	/**
	 * @return the curdate
	 */
	public String getCurdate() {
		return curdate;
	}
}
