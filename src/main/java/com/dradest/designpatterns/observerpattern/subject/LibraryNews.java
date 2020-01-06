package com.dradest.designpatterns.observerpattern.subject;

import com.dradest.designpatterns.observerpattern.members.LibraryMember;
import com.dradest.designpatterns.observerpattern.observer.Observer;

import java.util.ArrayList;

public class LibraryNews implements Subject {
    private ArrayList observers;
    private String news;

    public LibraryNews() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i=0; i<observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(news);
        }
    }

    public void newNews(){
        notifyObservers();
    }

    public void setNews(String news) {
        this.news = news;
        newNews();
    }
}
