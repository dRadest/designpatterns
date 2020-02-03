package com.dradest.designpatterns;

import com.dradest.designpatterns.adapterpattern.AdapterChargeLaptops;
import com.dradest.designpatterns.commandpattern.CommandController;
import com.dradest.designpatterns.componentpattern.ComponentShirtOrders;
import com.dradest.designpatterns.decoratorpattern.DecoratorParlor;
import com.dradest.designpatterns.facadepattern.CookBehindFacade;
import com.dradest.designpatterns.factorypattern.CarFactoryPattern;
import com.dradest.designpatterns.iteratorpattern.IteratorShirtOrder;
import com.dradest.designpatterns.observerpattern.ObserverLibrary;
import com.dradest.designpatterns.proxypattern.MakeRequestsOnProxyServer;
import com.dradest.designpatterns.singletonpattern.SendSingletonMessages;
import com.dradest.designpatterns.statepattern.WatchingTVState;
import com.dradest.designpatterns.strategy.StrategyWizards;
import com.dradest.designpatterns.templatemethod.ChocolateTemplateFactory;

/**
 * Place to showcase the design patterns
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // strategy pattern
//        StrategyWizards strategyWizards = new StrategyWizards();
//        strategyWizards.showStrategyMagic();

        // observer pattern
//        ObserverLibrary observerLibrary = new ObserverLibrary();
//        observerLibrary.showObserverLibrary();

        // decorator pattern
//        DecoratorParlor decoratorParlor = new DecoratorParlor();
//        decoratorParlor.orderFrozenYogurts();

        // factory pattern
//        CarFactoryPattern carFactoryPattern = new CarFactoryPattern();
//        carFactoryPattern.orderCars();

        // singleton pattern
//        SendSingletonMessages sendSingletonMessages = new SendSingletonMessages();
//        sendSingletonMessages.sendMessages();

        // command pattern
//        CommandController commandController = new CommandController();
//        commandController.loadCommands();

        // adapter pattern
        AdapterChargeLaptops adapterChargeLaptops = new AdapterChargeLaptops();
        adapterChargeLaptops.chargeLaptops();


    }

}
