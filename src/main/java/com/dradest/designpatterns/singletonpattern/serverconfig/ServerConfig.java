package com.dradest.designpatterns.singletonpattern.serverconfig;

public class ServerConfig {
    private Interval interval;
    private Magnitude magnitude;
    private String location;

    private static volatile ServerConfig uniqueInstance;

    public static ServerConfig getInstance() {
        if (uniqueInstance == null){
            synchronized (ServerConfig.class){
                uniqueInstance = new ServerConfig();
            }
        }
        return uniqueInstance;
    }

    private ServerConfig() {
    }

    public Interval getInterval() {
        return interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    public Magnitude getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(Magnitude magnitude) {
        this.magnitude = magnitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
