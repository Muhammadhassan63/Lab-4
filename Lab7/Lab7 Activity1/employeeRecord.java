/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_act1;

public class employeeRecord {
    private int emp_id;
    private double salary;
    
    public employeeRecord (){
    
    }
    public employeeRecord (int x, double y){
        emp_id =x;
        salary = y;
    }
    
    public void setEmp_id ( int id){
        emp_id = id;
    }
    
    public int getEmp_id (){
        return emp_id ;
    }
    
    public void setSalary ( int sal){
        salary = sal;
    }
    
    public double getSalary (){
        return salary ;
    }
}
    

