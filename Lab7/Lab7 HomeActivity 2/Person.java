/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_homeact2;

class Person {
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
 
