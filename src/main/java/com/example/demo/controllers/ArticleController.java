package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.domains.ArticleDto;
import com.example.demo.services.ArticleService;
import com.example.demo.utils.Printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController{
    @Autowired Printer printer;
    @Autowired ArticleService articleService;
    @PostMapping("/articles")
    public Map<?, ?> write(@RequestBody ArticleDto article){
        var map = new HashMap<>();
		int result = articleService.write(article);
        if(result ==1){
            map.put("nessage", "SUCCESS");
        }else{
            map.put("nessage", "FAILURE");
        }
        return map;
    }
}



