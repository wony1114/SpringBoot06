package com.example.demo.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.domains.ArticleDto;
import com.example.demo.repositories.ArticleRepository;
import com.example.demo.services.ArticleService;
import com.example.demo.utils.Printer;
import com.example.demo.utils.UserGenerator;
import com.example.demo.utils.Box;
import com.example.demo.utils.Crawler;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired ArticleRepository articleRepository;
    @Autowired Printer printer;
    @Autowired Crawler crawler;
    @Autowired UserGenerator ug;
    @Autowired ArticleDto article;
    @Override
    public int write(ArticleDto article) {
        article.setRegDate(LocalDate.now().toString());
        printer.accept("서비스로 전송된 데이터: " + article.toString());
        return articleRepository.insert(article);
    }

    @Override
    public List<ArticleDto> list() {
        
        return articleRepository.selectAll();
    }

    @Override
    public int crawling(String url) {
        var artBox = new Box<ArticleDto>();
        artBox = crawler.crawling(url);
        System.out.println("box size: "+artBox.size());
        
        for(int i =0; i< artBox.size(); i++){
            article = new ArticleDto();
            article = artBox.get(i);
            System.out.println("Article : "+article.toString());
            String userid = ug.makeUserid();
            System.out.println("글쓴이 아이디: "+userid);
            article.setWriterId(ug.makeUserid()); 
            article.setCount("0");
            write(artBox.get(i));
        }
        return count();
    }

    @Override
    public int count() {
        return articleRepository.count();
    }
    

    
}
