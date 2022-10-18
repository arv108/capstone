package com.gofortrainings.capstone.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition()
public @interface CapstoneConfigration {
    
   @AttributeDefinition(name = "YouTube Url")
   public String youtubeUrl() default "https://www.youtube.com/oembed?url=";
   
   @AttributeDefinition(name = "Article Page Path")
   public String articlePagePath() default "/content/capstone/us/en/articles";
   

}
