/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_act1_runner;

public class Clock {
    int hr;
    int min;
    int sec;
    
    
    Clock(){
        int hr=0;
        int min=0;
        int sec=0;
    }
    
    Clock(int hr, int min, int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }

    public int getHr() {
        return hr;
    }
   
    void display(){
        System.out.println("   12 HOUR CLOCK");
        System.out.println("Hour:"+hr+"\nMinutes:"+min+"\nSeconds: "+sec+"\nTime: "+hr+":" +min+":"+sec);
    }
    
}
