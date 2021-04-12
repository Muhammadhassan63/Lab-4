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
public class Lab7_act1 {

    public static void main(String[] args) {
        studentRecord s = new studentRecord("BBA");
        employeeRecord e = new employeeRecord(123, 50000);
        Manager m1 = new Manager("GovtOfficer", 5000, e, s ) ;
        m1.display();
}
}
    
        

   
