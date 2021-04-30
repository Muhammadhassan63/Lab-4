/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_runner;

/**
 *
 * @author abc
 */
public class PhDStudent extends Student {
    public PhDStudent(String name,int age, int rn){
        super(name,age,rn);
    }

    public void takeExam(){
        System.out.println("\nGive Your Final Defense Presentation");
    }
}
    

