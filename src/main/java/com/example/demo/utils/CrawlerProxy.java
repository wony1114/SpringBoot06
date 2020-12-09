package com.example.demo.utils;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CrawlerProxy extends Proxy {
    @Autowired Printer printer;
    public List<?> crawling(String url){
        printer.accept("크롤링 대상 URL : "+url);
        var map = hashmap();
        
        return null;
    }
}
