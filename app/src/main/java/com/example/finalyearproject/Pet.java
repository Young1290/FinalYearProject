package com.example.finalyearproject;

public class Pet {

    public String petname;
    public String age;
    public String weight;
//    public Integer temp;
//    public Integer bpm;

    public Pet(){
    }

    public Pet(String petname, String age, String weight){
        this.petname = petname;
        this.age = age;
        this.weight = weight;
    }

//    public Pet(Integer temp, Integer bpm){
//        this.temp = temp;
//        this.bpm = bpm;
//    }
    public String getUserName() {
        return petname;
    }
    public String getUserAge() {
        return age;
    }
    public String getUserWeight() {
        return weight;
    }
//    public Integer getPetTemp() {
//        return temp;
//    }
//    public Integer getPetBpm() {
//        return bpm;
//    }

}
