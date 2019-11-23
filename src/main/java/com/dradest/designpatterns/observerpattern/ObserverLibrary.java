package com.dradest.designpatterns.observerpattern;

import com.dradest.designpatterns.observerpattern.members.George;
import com.dradest.designpatterns.observerpattern.members.Lana;
import com.dradest.designpatterns.observerpattern.members.Steven;
import com.dradest.designpatterns.observerpattern.observer.Lilly;
import com.dradest.designpatterns.observerpattern.subject.LibraryNews;

public class ObserverLibrary {

    public void showObserverLibrary(){
        LibraryNews libraryNews = new LibraryNews();

        George memberGeorge = new George(libraryNews);
        Lana memberLana = new Lana(libraryNews);
        Steven memberSteven = new Steven(libraryNews);
        Lilly nonmemberLilly = new Lilly();

        libraryNews.setNews("Book reading club meeting this Thrusday at 5pm.");
        System.out.println();
        libraryNews.registerObserver(nonmemberLilly);
        libraryNews.setNews("Don't miss our literary night with best selling author JG this Saturday!");
        System.out.println();
        libraryNews.removeObserver(memberSteven);
        System.out.println("Steven unsubscribed from library news.\n");
        libraryNews.setNews("Due to maintenance work library will be closed on Tuesday.");
    }
}
