package com.example.demo.services;

import java.util.List;

import com.example.demo.domains.ArticleDto;

import org.springframework.stereotype.Component;

@Component
public interface ArticleService {

	public int write(ArticleDto article);

	public List<ArticleDto> list();

	public int crawling(String string);

	public int count();

	public ArticleDto getArticleById(String artNum);

	public int increaseCount(String artNum);

	public int update(ArticleDto article);

	public int delete(ArticleDto article);

}
