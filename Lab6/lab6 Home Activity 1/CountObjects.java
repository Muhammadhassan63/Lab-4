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
public class CountObjects {
    private static int objcounter=0;
    private static int i;
    public CountObjects(){
        objcounter++;
        
    }
    public CountObjects(int obj){
        i=obj;
        objcounter++;
    }
    public static int totalObjects(){
        return objcounter;
        
    }
}
   
