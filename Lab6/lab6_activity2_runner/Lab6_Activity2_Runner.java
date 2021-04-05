/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_activity2_runner;


public class Lab6_Activity2_Runner {

    
    public static void main(String[] args) {
          NoOfObjects o1=new NoOfObjects();   
          NoOfObjects o2=new NoOfObjects(122);   
          NoOfObjects o3=new NoOfObjects(150);      
          System.out.println("Objects created:"+ NoOfObjects.getObjsCreated());   
          System.out.println("Objects created:"+ o1.getObjsCreated());  } } 
