/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_runner;


abstract class Student {
    private String name;
    private int age;
    private int rollNumber;

    public Student(String name,int age, int rn){
        this.name = name;
        this.age = age;
        this.rollNumber = rn;
    }

    void display(){
        System.out.print("Student Name: "+name+"\nStudent Roll Number: "+rollNumber+"\nStudent Age: "+age);
    }

    abstract void takeExam();
}

    

