package com.eve.springdemo.part3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class FordFocus implements Car{
    Engine engine;

    @Value("${car.horsePower}")
    int horsePower;
    @Value("${car.rank}")
    int carRank;

    public int getHorsePower() {
        return horsePower;
    }

    public int getCarRank() {
        return carRank;
    }

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
