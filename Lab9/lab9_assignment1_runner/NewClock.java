/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_act1_runner;

/**
 *
 * @author abc
 */
public class NewClock extends Clock {
    String beforeAfter_noon;
    
    
    
   
    NewClock(int hr, int min, int sec, String beforeAfter_noon){
      super(hr,  min, sec);
      this.beforeAfter_noon=beforeAfter_noon;
    }
    public int clock24(){
        int hour = getHr();
            hour = hour + 12;
            return hour;     
    }
    @Override
     void display(){
         super.display();
        System.out.println("\n   24 HOUR CLOCK");
        System.out.println("Hour:"+clock24()+"\nMinutes:"+min+"\nSeconds: "+sec+"\nAM or PM: "+  beforeAfter_noon+"\nTime: "+clock24()+":" +min+":"+sec+ " "+ beforeAfter_noon);
    }
    
}
       
    

