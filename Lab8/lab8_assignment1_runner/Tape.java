/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_assignment1_runner;

/**
 *
 * @author abc
 */
public class Tape extends Publication{ 
  private int timeInMinutes;  

    public Tape(String title, int price, int timeInMinute) {
        super(title, price);
        this.timeInMinutes=timeInMinute;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

   
    public void setTimeInMinutes(int TimeInMinutes) {
        this.timeInMinutes = TimeInMinutes;
    }
    
    
    public void display(){
    super.display();
        System.out.println("The playing time is "+timeInMinutes+" minutes");
    }
}