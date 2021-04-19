/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_assignment2_runner;


public class Camputer {
    private int wordSize;
    private int memorySize;
    private int storageSize;
    private double speed;

    public Camputer(){
        wordSize = 0;
        memorySize = 0;
        storageSize = 0;
        speed = 0;
    }

    public Camputer(int wordSize,int memorySize,int storageSize,double speed){
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }

    public void display(){
        System.out.println("Word Size: "+wordSize+" Bits\nMemory Size: "+memorySize+" Megabits\nStorage Size: "+storageSize+" Megabytes\nSpeed: "+speed+" MegaHertz");
    }
}
    

