package com.saygindogu.saygin.androidplay;

/**
 * Created by saygin on 3/2/2016.
 */
public class TravelPreference {
    private String name;
    private int drawableId;

    public TravelPreference( String name, int id){
        this.name = name;
        this.drawableId = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getImageId(){
        return drawableId;
    }
}