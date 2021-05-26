/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_task1;



public class GeometricShape implements Shape{

    private double h;
    private double b;
   
    
    public GeometricShape(double h, double b){
        
        this.h = h;
        this.b = b;
        
    }
    
    @Override
    public double area(){
    
    return h*b;
    }
}

    
    

