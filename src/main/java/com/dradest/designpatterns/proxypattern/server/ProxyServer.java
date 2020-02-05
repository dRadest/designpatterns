package com.dradest.designpatterns.proxypattern.server;

public class ProxyServer implements Server {
    private Server server;

    public ProxyServer() {
        server = new RealServer();
    }

    private enum Request{
        GET,
        HEAD,
        POST,
        PUT,
        DELETE,
        CONNECT,
        OPTIONS,
        TRACE;

        public static boolean isValidRequest(String request){
            request = request.toUpperCase();
            if (request.equals(GET.toString()) || request.equals(HEAD.toString()) || request.equals(POST.toString()) ||
                    request.equals(PUT.toString()) || request.equals(DELETE.toString()) || request.equals(CONNECT.toString()) ||
                    request.equals(OPTIONS.toString()) || request.equals(TRACE.toString())){
                return true;
            }else {
                return false;
            }

        }
    }

    @Override
    public void respond(String request) {
        if (Request.isValidRequest(request)){
            server.respond(request.toUpperCase());
        }else {
            System.out.println("Bad request!");
        }
    }
}
