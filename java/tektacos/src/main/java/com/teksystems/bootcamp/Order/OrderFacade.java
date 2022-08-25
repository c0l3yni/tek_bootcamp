package com.teksystems.bootcamp.Order;

import com.teksystems.bootcamp.BasicTaco.BasicTaco;

public class OrderFacade {
    BasicTaco basicTaco;

    public BasicTaco getBasicTaco() {
        basicTaco.buildBasicTaco();
        return basicTaco;
    }


}
