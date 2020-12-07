package com.example.demo.services;

import com.example.demo.domains.ArticleDto;

import org.springframework.stereotype.Component;

@Component
public interface ArticleService {

	int write(ArticleDto article);

	

}
