package com.ems.extra_concepts;

public class TourChaining {

    String place;
    String travelBy;

    public TourChaining setPlace(String place) {
        this.place = place;
        return this;
    }

    public TourChaining setTravelBy(String travelBy) {
        this.travelBy = travelBy;
        return this;
    }

    public void getPlace(){
        System.out.println("Are you Going to " + place + " By using the " + travelBy);
    }

    public static void main(String[] args) {

        TourChaining goingtour = new TourChaining();
        // Chaining method
        goingtour.setPlace("London").setTravelBy("Flight").getPlace();

        goingtour.setPlace("India");
        goingtour.setTravelBy("Car");
        goingtour.getPlace();
    }
}
