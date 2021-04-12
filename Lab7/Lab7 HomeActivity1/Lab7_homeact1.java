/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_homeact1;

public class Lab7_homeact1 {

    public static void main(String[] args) {
         Address a = new Address("Twelve","275/6","Islamabad",92);
        Person p = new Person(a);
        p.getAddress();
    }
    
}
 