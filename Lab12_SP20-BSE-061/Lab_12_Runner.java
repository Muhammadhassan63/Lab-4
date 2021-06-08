/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_12_runner;

import java.util.ArrayList;

/**
 *
 * @author abc
 */
public class Lab_12_Runner {

    
    public static void main(String[] args) {
       {
    Student s1 = new Student("Hassan", "011");
    Student s2 = new Student("Seher", "012");
    Student s3 = new Student("Sadaf", "013");

    Teacher t1 = new Teacher("Sajida Kulsoom", "0011");
    Teacher t2 = new Teacher("Behjaat", "0012");
    Teacher t3 = new Teacher("Talha", "0013");

   
    ArrayList<Association> ar = new ArrayList<>();

    ar.add(s1);
    ar.add(s2);
    ar.add(s3);
    ar.add(t1);
    ar.add(t2);
    ar.add(t3);
    ar.remove(1);
    System.out.println(ar);

}
       
          /*  HumanResource hr = new HumanResource();
        hr.add(s1);
        hr.add(s2);
        hr.add(s3);
       
        hr.add(t1);
        hr.add(t2);
        hr.add(t3);
        hr.delete(3);
        System.out.println(hr);*/


}}