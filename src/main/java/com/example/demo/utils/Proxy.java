package com.example.demo.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.stereotype.Component;

@Component("px")
public class Proxy {
    public int interger(String t){
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(t);
    }
    public String string(Object t){
       Function<Object, String> s = String::valueOf;
        return s.apply(t);
    }
    public boolean equals(String t1, String t2){
        BiPredicate<String, String> p = String::equals;
        return p.test(t1, t2);
    }
    public int random(int begin, int end){
        // int r = (int)(Math.random()*46)+1; 1~45까지 랜덤수
        BiFunction<Integer, Integer, Integer> f = (t, u) -> (int)(Math.random() *(u-t)) + t;
        return f.apply(begin, end);
    }
    public int[] array(int size){
        // int[] arr = new int[5]
        Function<Integer, int[]> f = int[]::new;
        return f.apply(size);
    }
    public Map<String, Object> hashmap(){
        // Map<String, String> map = new HashMap<>();
        Supplier<Map<String, Object>> s = HashMap::new;
        return s.get();
    }
    public String message(int i){
        return (i==1) ? "SUCCESS" : "FAILURE";
    }
    public String time(){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }
    public File mkdir(String t, String u){
        BiFunction<String, String, File> f = File::new;
        return f.apply(t, u);
    }
    public File mkfile(File t, String u){
        BiFunction<File, String, File> f = File::new;
        return f.apply(t, u);
    }
}
