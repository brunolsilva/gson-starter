package com.test;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;

@Configuration
@ConditionalOnClass(Gson.class)
public class GsonAutoConfigure {

	@Bean
	@ConditionalOnMissingBean
	public Gson gson() {
		return new Gson();
	}

}
