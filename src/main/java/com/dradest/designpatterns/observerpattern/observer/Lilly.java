package com.dradest.designpatterns.observerpattern.observer;

import com.dradest.designpatterns.observerpattern.subject.Subject;

public class Lilly implements Observer {
    private String news;
    private Subject libraryNews;

    public Lilly(){}

    public Lilly(Subject libraryNews) {
        this.libraryNews = libraryNews;
        libraryNews.registerObserver(this);
    }

    @Override
    public void update(String news) {
        this.news = news;
        System.out.println("Lilly's newsfeed is updated. She decides to read it later.");
    }
}
