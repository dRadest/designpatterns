package com.dradest.designpatterns.observerpattern.members;

import com.dradest.designpatterns.observerpattern.observer.Observer;
import com.dradest.designpatterns.observerpattern.subject.Subject;

public class Lana implements Observer, LibraryMember {

    private String news;
    private Subject libraryNews;

    public Lana(Subject libraryNews) {
        this.libraryNews = libraryNews;
        libraryNews.registerObserver(this);
    }

    @Override
    public void update(String news) {
        this.news = news;
        read();

    }

    @Override
    public void read() {
        System.out.println("Lana reading news: " + news);
    }

}
