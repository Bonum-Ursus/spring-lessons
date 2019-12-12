package com.eve.springdemo.part2;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{
//    String[] fortuneArray = {
//            "Per aspera ad astra - Через тернии к звездам",
//            "Divide et impera - Разделяй и властвуй",
//            "Hoc est vivere bis, vita posse priore frui - Уметь наслаждаться прожитой жизнью - значит жить дважды",
//            "Hominis est errare - Человеку свойственно ошибаться",
//            "Aut viam inveniam, aut faciam - Или найду дорогу, или проложу ее сам"
//    };
//
//    int index = new Random().nextInt(fortuneArray.length);

    public RandomFortuneService() throws FileNotFoundException {
    }

    @Override
    public String getFortune() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c:\\Users\\User\\Eclipse-workspace-SE\\spring-1\\src\\main\\resources\\lat.text"));
        List<String> fortuneList = new ArrayList<>();
        while (br.ready()){
            fortuneList.add(br.readLine());
        }
        br.close();
        int randomIndex = new Random().nextInt(fortuneList.size()-1);
        return fortuneList.get(randomIndex);
//        return fortuneArray[index];
    }
}
