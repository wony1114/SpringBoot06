package com.example.demo.repositories;

import com.example.demo.domains.ArticleDto;

import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository {

	public int insert(ArticleDto article);

}
