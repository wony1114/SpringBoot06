package com.example.demo.domains;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class ArticleDto {
   private String artNum, writerId, title, content, regDate, count;
    

}
