package com.sda.tutorials.SpringTut.GymApp.service;

import org.springframework.stereotype.Component;

@Component
public class DietServiceImpl implements DietService {
    @Override
    public String getDailyDiet() {
        return "My daily diet";
    }
}
