
package lab7_homeact1;

public class Address {
    private String street_number;
    private String house_number;
    private String city;
    private int code;
    
    Address(String street, String house, String city, int code){
        this.street_number = street;
        this.house_number = house;
        this.code = code;
        this.city = city;
    }
    
    public void setStreet(String street){
        this.street_number = street;
    }
    public void setHouse(String house){
        this.house_number = house;
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
        return street_number;
    }
    
    public int getCode(){
        return code;
    }
    
    public void Display(){
        System.out.println("Street Number: "+ street_number+ "\nHouse Number:" + house_number+ "\nCity Name:" + city + "\nCode:" + code);
    }
    
    
}
    
