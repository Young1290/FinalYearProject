package com.example.finalyearproject;

public class Track {

    public Integer longitude;
    public Integer latitude;


    public Track(){
    }

    public Track(Integer latitude, Integer longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }
    public Integer getLongitude() {
        return longitude;
    }

//    public Integer getPetTemp() {
//        return temp;
//    }
//    public Integer getPetBpm() {
//        return bpm;
//    }

}
