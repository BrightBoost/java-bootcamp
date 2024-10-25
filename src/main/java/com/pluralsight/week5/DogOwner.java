package com.pluralsight.week5;

import java.util.List;

public class DogOwner {
    private List<Dog> dog;

    public List<Dog> getDog() {
        return dog;
    }

    public void setDog(List<Dog> dog) {
        this.dog = dog;
    }

    // stub method
    public String[] getAllDogNames(){
        String[] strArray = new String[0];
        return strArray;
    }
}
