package com.employee.record.employeeRecord;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ctc.wstx.ent.ExtEntity;

@Configuration
public class restConfig implements WebMvcConfigurer
{
 @Override
 public void configureContentNegotiation(ContentNegotiationConfigurer configurer)
 {
	
	configurer.favorParameter(true)
	.parameterName("mediaType")
	 .defaultContentType(MediaType.APPLICATION_JSON)
	 .mediaType("json", MediaType.APPLICATION_JSON)
	 .mediaType("xml", MediaType.APPLICATION_XML);
	 
	 
 }
}
