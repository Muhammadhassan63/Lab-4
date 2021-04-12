/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_homeact3;


public class Line {
    private Point startPoint;
    private Point endPoint;
    
    
    Line(Point startPoint, Point endPoint){
        this.startPoint= startPoint;
        this.endPoint= endPoint;
    }
    
    public double Length(){
        double x= Math.sqrt(Math.pow(startPoint.getX()-endPoint.getX(), 2) + Math.pow(startPoint.getY()-endPoint.getY(), 2));
        return x;
    }
}
