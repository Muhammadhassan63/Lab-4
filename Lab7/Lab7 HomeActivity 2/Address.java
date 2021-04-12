/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_homeact2;


class Address {
    private String street_number;
    private String house_number;
    private String city;
    private int code;
    
    Address(String street, String house, String city, int code){
        street_number = street;
        house_number = house;
        this.city = city;
        this.code = code;
    }
    
    public void setStreet(String street){
        street_number = street;
    }
    public void setHouse(String house){
       house_number = house;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setCode(int code){
        this.code = code;
    }
    
    public String getStreet(){
        return street_number;
    }
    
    public String getHouse(){
        return house_number;
    }
    
    public String getCity(){
        return city;
    }
    
    public int getCode(){
        return code;
    }
    
    public void Display(){
        System.out.println("Street Number: "+ street_number+ "\nHouse Number:" + house_number+ "\nCity Name:" + city + "\nCode:" + code);
    }
    
    
}
    


