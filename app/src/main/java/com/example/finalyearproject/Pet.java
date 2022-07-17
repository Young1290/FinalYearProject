package com.example.finalyearproject;

public class Pet {

    public String name;
    public String age;
    public String weight;

    public Pet(){
    }

    public Pet(String name, String age, String weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String getUserName() {
        return name;
    }
    public String getUserAge() {
        return age;
    }
    public String getUserWeight() {
        return weight;
    }
}
