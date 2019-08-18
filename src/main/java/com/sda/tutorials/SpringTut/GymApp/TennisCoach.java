package com.sda.tutorials.SpringTut.GymApp;


import com.sda.tutorials.SpringTut.GymApp.service.DietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {


    private DietService dietService;

    @Autowired
    public TennisCoach(DietService dietService) {
        this.dietService = dietService;
    }

    @Override
    public String getDailyWorkout() {
        return "Tennis coach";
    }

    @Override
    public String getDailyDiet(){
        return dietService.getDailyDiet();
    }
}
