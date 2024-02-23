package com.example.names.models;

public class Greeting {

    // All fields are private
    private String name;
    private String timeOfDay;

    //Default constructor
    public Greeting(){}

    public Greeting(String name, String timeOfDay){
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    // Public getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }
    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}
