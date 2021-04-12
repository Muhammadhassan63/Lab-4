/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_act1;

/**
 *
 * @author abc
 */
public class studentRecord {
     private String degree;
    
     public studentRecord(){
    
    }
    public studentRecord(String s){
        degree = s;
    }
    
    public void setDegree ( String deg){
        degree = deg;
    }
    
    public String getDegree (){
        return degree;
    }

}

    

