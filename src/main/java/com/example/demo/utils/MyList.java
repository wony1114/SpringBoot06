package com.example.demo.utils;

import java.util.ArrayList;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class MyList<T> {
    private ArrayList<T> list;
    public MyList(){
        list = new ArrayList<>();
    }
    public T get(int i){
        return list.get(i);
    }
    public int size(){
        return list.size();
    }
    public void add(T t){
        list.add(t);
    }
    public boolean contains(T t){
        return list.contains(t);
    }
    public ArrayList<T> get(){
        return list;
    }
    public String toString(){
        return list.toString();
    }
    public void clear(){
        list.clear();
    }
	
}
