package com.dradest.designpatterns.observerpattern.members;

import com.dradest.designpatterns.observerpattern.observer.Observer;
import com.dradest.designpatterns.observerpattern.subject.Subject;

public class George implements Observer, LibraryMember {
    private String news;
    private Subject libraryNews;
    ;
    public George(Subject libraryNews) {
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
        System.out.println("George reading news: " + news);
    }
}
