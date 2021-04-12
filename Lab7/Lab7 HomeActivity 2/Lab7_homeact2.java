/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_homeact2;

public class Lab7_homeact2 {

    public static void main(String[] args) {
        Address a = new Address("a","b","c",1);
        a.setCity("Karachi");
        a.setHouse("HF#61");
        a.setStreet("7");
        a.setCode(46000);
        System.out.println("Street Number: "+a.getStreet()+"\nHouse Number: "+a.getHouse()+"\nCity: "+a.getCity());
        
        Person p = new Person(a);
        Book b = new Book(p,"Creation of Pakistan","Chaudhry and Sons");
        b.display();
       
    }


}
    
    

