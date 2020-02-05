package com.dradest.designpatterns.proxypattern.server;

public class RealServer implements Server {
    @Override
    public void respond(String request) {
        System.out.println("Responding to " + request + " request");
    }
}
