package com.dradest.designpatterns.singletonpattern;

import com.dradest.designpatterns.singletonpattern.serverconfig.Interval;
import com.dradest.designpatterns.singletonpattern.serverconfig.Magnitude;
import com.dradest.designpatterns.singletonpattern.serverconfig.ServerConfig;

public class SendSingletonMessages {

    public void sendMessages(){
        System.out.println("Our app boots...");
        ServerConfig serverConfig = ServerConfig.getInstance();
        readingConfigFromApp(serverConfig);

        Interval interval = serverConfig.getInterval();
        Magnitude magnitude = serverConfig.getMagnitude();
        String location = serverConfig.getLocation();

        if (interval != null && magnitude != null && location != null){
            System.out.println("Default settings \ninterval = " + interval + "\nmagnitude = " + magnitude + "\nlocation = " + location);
        }

        System.out.println("\nGetting messages hourly is too much. Daily will suffice.");
        serverConfig.setInterval(Interval.DAILY);
        interval = serverConfig.getInterval();
        magnitude = serverConfig.getMagnitude();
        location = serverConfig.getLocation();

        if (interval != null && magnitude != null && location != null){
            System.out.println("Current settings \ninterval = " + interval + "\nmagnitude = " + magnitude + "\nlocation = " + location);
        }

        System.out.println("\nWe are travelling to Havana and we are interested in seizmologic activity there.");
        serverConfig.setLocation("Havana, Cuba");
        interval = serverConfig.getInterval();
        magnitude = serverConfig.getMagnitude();
        location = serverConfig.getLocation();

        if (interval != null && magnitude != null && location != null){
            System.out.println("Current settings \ninterval = " + interval + "\nmagnitude = " + magnitude + "\nlocation = " + location);
        }

        System.out.println("\nWe are not going to bother with earthquakes we can't even feel");
        serverConfig.setMagnitude(Magnitude.MEDIUM);
        interval = serverConfig.getInterval();
        magnitude = serverConfig.getMagnitude();
        location = serverConfig.getLocation();

        if (interval != null && magnitude != null && location != null){
            System.out.println("Current settings \ninterval = " + interval + "\nmagnitude = " + magnitude + "\nlocation = " + location);
        }

        System.out.println("\nLet's call getInstance() of ServerConfig to check if our settings persist");
        serverConfig = ServerConfig.getInstance();
        interval = serverConfig.getInterval();
        magnitude = serverConfig.getMagnitude();
        location = serverConfig.getLocation();

        if (interval != null && magnitude != null && location != null){
            System.out.println("Current settings \ninterval = " + interval + "\nmagnitude = " + magnitude + "\nlocation = " + location);
        }


    }

    private void readingConfigFromApp(ServerConfig serverConfig){
        serverConfig.setInterval(Interval.HOURLY);
        serverConfig.setMagnitude(Magnitude.LOW);
        serverConfig.setLocation("home");
    }
}
