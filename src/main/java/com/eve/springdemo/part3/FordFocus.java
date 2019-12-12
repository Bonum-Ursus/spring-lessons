package com.eve.springdemo.part3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class FordFocus implements Car{
    Engine engine;


    public FordFocus(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void getEngineInfo() {
        engine.getEngineInfo();
    }

    @Override
    public void getCarInfo() {
        System.out.println("It is " + this.getClass().getSimpleName());
    }
}
