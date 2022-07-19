package com.example.finalyearproject;

public class Track {

    public String longitude;
    public String latitude;


    public Track(){
    }

    public Track(String latitude, String longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }
    public String getLongitude() {
        return longitude;
    }


}
