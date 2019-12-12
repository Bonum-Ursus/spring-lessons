package com.eve.springdemo.part3;

import org.springframework.stereotype.Component;


public class GasEngine implements Engine{
    @Override
    public void getEngineInfo() {
        System.out.println("It is gas engine");
    }
}
