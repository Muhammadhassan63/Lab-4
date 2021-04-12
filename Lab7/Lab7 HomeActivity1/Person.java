
package lab7_homeact1;

public class Person {
     private Address address;
    
    public Person(Address address){
        this.address=address;
    }
    
    public void getAddress(){
        address.Display();
}
    public void setAddress(Address address){
        this.address=address;
    }
}

