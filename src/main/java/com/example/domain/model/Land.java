package com.example.domain.model;

public class Land {

    LandNumber number;
    LandName name;

    Land(LandNumber number,
         LandName name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Land{" +
                "number=" + number +
                ", name=" + name +
                '}';
    }

    private Land() {
    }
}