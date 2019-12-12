package com.eve.springdemo.part2;

import org.springframework.stereotype.Component;

import java.io.IOException;

public interface FortuneService {
    public String getFortune() throws IOException;
}
