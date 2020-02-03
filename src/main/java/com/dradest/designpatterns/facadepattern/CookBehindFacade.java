package com.dradest.designpatterns.facadepattern;

import com.dradest.designpatterns.facadepattern.kitchenfacade.KitchenFacade;
import com.dradest.designpatterns.facadepattern.kitchenparts.CanOpener;
import com.dradest.designpatterns.facadepattern.kitchenparts.CuttingBoard;
import com.dradest.designpatterns.facadepattern.kitchenparts.Stove;
import com.dradest.designpatterns.facadepattern.kitchenparts.Washer;

public class CookBehindFacade {

    public void prepareNiceMeal(){
        Washer washer = new Washer();
        CuttingBoard cuttingBoard = new CuttingBoard();
        CanOpener canOpener = new CanOpener();
        Stove stove = new Stove();

        KitchenFacade kitchenFacade = new KitchenFacade(washer, cuttingBoard, canOpener, stove);
        System.out.println("====== Start preparing a nice meal ======");
        kitchenFacade.prepareBurritos();
        System.out.println("====== Meal prepared. Time to clean up ======");
        kitchenFacade.cleanKitchen();

    }
}
