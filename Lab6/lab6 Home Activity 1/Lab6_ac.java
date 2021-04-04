/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_ac;

/**
 *
 * @author abc
 */
public class Lab6_ac {
    public static void main(String[] args) {
        CountObjects obj1 = new CountObjects();
        CountObjects obj2 = new CountObjects(22);
        CountObjects obj3 = new CountObjects(33);
        CountObjects obj4 = new CountObjects(44);
        CountObjects obj5 = new CountObjects(55);
        System.out.println("The total number of objects created are: " + obj1.totalObjects());
    }

}
        
 