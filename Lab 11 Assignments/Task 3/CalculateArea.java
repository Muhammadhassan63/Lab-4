/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_task2;

/**
 *
 * @author abc
 */
public class CalculateArea {
      
        
        Shape[] object = new Shape[5];
        obj[0] = new Circle(6.2);
        obj[1] = new Triangle(3,6);
        obj[2] = new Circle(7.0);
        obj[3] = new Rectangle(9,10.0);
        obj[4] = new Triangle(10,9.0);

        double[] area =  function(object);
        for (int i=0 ; i < 5 ; i++)
        {
            System.out.println("AREA of "+ object[i].getClass() + " is:"    + area[i] );
        }

    }

    static double[] function(Shape[] obj){

        double[] area = new double[obj.length];

        for (int i =0 ; i<5 ; i++)
        {
            if ( (obj[i]) instanceof Circle)
            {
                area[i] = obj[i].area();
            }
            else if ((obj[i]) instanceof Rectangle)
            {
                area[i] =  obj[i].area();
            }
            else if ((obj[i]) instanceof Triangle)
            {
                area[i] =  obj[i].area();
            }
        }
        return area;
    }
