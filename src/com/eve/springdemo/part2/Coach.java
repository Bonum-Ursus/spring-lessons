package com.eve.springdemo.part2;

import java.io.IOException;

public interface Coach {
    public String getDailyWorkout();
    public String getDailyFortune() throws IOException;
}
