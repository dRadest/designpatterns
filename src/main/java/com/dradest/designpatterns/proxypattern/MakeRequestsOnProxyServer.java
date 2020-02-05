package com.dradest.designpatterns.proxypattern;

import com.dradest.designpatterns.proxypattern.server.ProxyServer;
import com.dradest.designpatterns.proxypattern.server.Server;

public class MakeRequestsOnProxyServer {

    public void makeProxyRequests(){
        Server server = new ProxyServer();
        server.respond("GET");
        server.respond("HEAD");
        server.respond("post");
        server.respond("zblj");
    }
}
