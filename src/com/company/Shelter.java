package com.company;

public class Shelter {
    String name;
    String address;

    public Shelter(String name , String address){
        this.name = name;
        this.address = address;
    }
    public String getName (){
        return name;
    }
    public void setName (String name ){
        this.name= name;

    }
    public String getAddress (){
        return address;
    }
    public void getAddress(String address){
        this.address = address;
    }

}
