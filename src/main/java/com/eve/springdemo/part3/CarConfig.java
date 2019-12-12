package com.eve.springdemo.part3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:car.properties")
//@ComponentScan("com.eve.springdemo.part3")    //useless because all beans and dependencies create in config class.
public class CarConfig {
    @Bean
    public Engine electricalEngine(){
        ElectricalEngine electricalEngine = new ElectricalEngine();
        return electricalEngine;
    }
    @Bean
    public Engine gasEngine(){
        GasEngine gasEngine = new GasEngine();
        return gasEngine;
    }

    @Bean
    public Car toyotaPrius(){
        ToyotaPrius toyotaPrius = new ToyotaPrius(electricalEngine());
        return toyotaPrius;
    }
    @Bean
    public Car fordFocus(){
        FordFocus fordFocus = new FordFocus(gasEngine());
        return fordFocus;
    }


}
