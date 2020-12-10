package com.example.demo.repositories;

import java.util.List;

import com.example.demo.domains.ArticleDto;

import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository {

	public int insert(ArticleDto article);
	public int count();
	public List<ArticleDto> selectAll();
	public ArticleDto selectById(String artNum);
	public int updateCount(String artNum);
	public int update(ArticleDto article);
	public int delete(ArticleDto article);
}

