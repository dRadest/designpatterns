package com.dradest.designpatterns.facadepattern.kitchenfacade;

import com.dradest.designpatterns.facadepattern.kitchenparts.CanOpener;
import com.dradest.designpatterns.facadepattern.kitchenparts.CuttingBoard;
import com.dradest.designpatterns.facadepattern.kitchenparts.Stove;
import com.dradest.designpatterns.facadepattern.kitchenparts.Washer;

public class KitchenFacade {
    Washer washer;
    CuttingBoard cuttingBoard;
    CanOpener canOpener;
    Stove stove;

    public KitchenFacade(Washer washer, CuttingBoard cuttingBoard, CanOpener canOpener, Stove stove) {
        this.washer = washer;
        this.cuttingBoard = cuttingBoard;
        this.canOpener = canOpener;
        this.stove = stove;
    }

    public void prepareBurritos(){
        washer.washVegetables();
        cuttingBoard.cutOnions();
        cuttingBoard.minceGarlic();
        cuttingBoard.chopPepper();
        canOpener.openBeans();
        canOpener.openCorn();
        stove.turnOn();
        stove.sauteOnion();
        stove.cookVegetables();
        stove.turnOff();
    }

    public void cleanKitchen(){
        canOpener.clean();
        cuttingBoard.clean();
        washer.clean();
        stove.clean();
    }
}
