package com.example.domain.model;

class LandName {

    String value;

    LandName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private LandName() {
    }
}