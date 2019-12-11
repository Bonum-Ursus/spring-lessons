package com.eve.springdemo.part2;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{
    String[] fortuneArray = {
            "Per aspera ad astra - Через тернии к звездам",
            "Divide et impera - Разделяй и властвуй",
            "Hoc est vivere bis, vita posse priore frui - Уметь наслаждаться прожитой жизнью - значит жить дважды",
            "Hominis est errare - Человеку свойственно ошибаться",
            "Aut viam inveniam, aut faciam - Или найду дорогу, или проложу ее сам"
    };

    int index = new Random().nextInt(fortuneArray.length);

    @Override
    public String getFortune() {
        return fortuneArray[index];
    }
}
