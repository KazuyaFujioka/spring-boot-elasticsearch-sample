package com.example.domain.model;

class LandNumber {

    Integer value;

    LandNumber(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    private LandNumber() {
    }
}