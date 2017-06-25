package com.linkedin.learning.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class ConversasionConfig {

	private Set<Converter> getConverters(){
		Set<Converter> converters = new HashSet<Converter>();
		
		return converters;
	}
	
	public ConversionService conversasionService(){
		ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean(); 
		bean.setConverters(getConverters());
		bean.afterPropertiesSet();
		
		return bean.getObject();
	}
}
