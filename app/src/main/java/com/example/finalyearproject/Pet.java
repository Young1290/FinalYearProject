package com.example.finalyearproject;

public class Pet {

    public String name;
    public String age;
    public String weight;
//    public Integer temp;
//    public Integer bpm;

    public Pet(){
    }

    public Pet(String name, String age, String weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

//    public Pet(Integer temp, Integer bpm){
//        this.temp = temp;
//        this.bpm = bpm;
//    }
    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public String getWeight() {
        return weight;
    }
//    public Integer getPetTemp() {
//        return temp;
//    }
//    public Integer getPetBpm() {
//        return bpm;
//    }

}
