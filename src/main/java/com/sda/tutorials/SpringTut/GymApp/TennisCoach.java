package com.sda.tutorials.SpringTut.GymApp;


import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Tennis coach";
    }
}
