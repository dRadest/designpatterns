package com.dradest.designpatterns.observerpattern.subject;

import com.dradest.designpatterns.observerpattern.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
