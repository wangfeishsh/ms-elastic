package com.bao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


@SpringBootApplication
public class MsElasticApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsElasticApplication.class, args);
	}
}
