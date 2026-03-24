package com.gal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.gal.algo.FileListProvider;
import com.gal.algo.WordCounter;

@Configuration
public class BeansConfig {

	@Bean
	@Scope("singleton")
	FileListProvider fileListProvider() {
		return new FileListProvider();
	}

	@Bean
	WordCounter wordCounter() {
		return new WordCounter();
	}
}