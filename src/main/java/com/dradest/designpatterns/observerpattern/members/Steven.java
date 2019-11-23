package com.dradest.designpatterns.observerpattern.members;

import com.dradest.designpatterns.observerpattern.observer.Observer;
import com.dradest.designpatterns.observerpattern.subject.Subject;

public class Steven implements Observer, LibraryMember {

    private String news;
    private Subject libraryNews;

    public Steven(Subject libraryNews) {
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
        System.out.println("Steven reading news: " + news);

    }
}
