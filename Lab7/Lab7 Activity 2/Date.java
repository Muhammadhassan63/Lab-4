/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_act2;

/**
 *
 * @author abc
 */
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date (int theMonth, int theDay, int theYear )    {
        month=checkmonth(theMonth);
        day=checkday(theDay);
        year=theYear;
    }
    
    private int checkmonth (int testMonth){
        if (testMonth>0 &&testMonth<=12){
            return testMonth;
        }else{
            System.out.println("Invalid month" + testMonth + "set to 1");
            return 1;
        }
    }
    
    private int checkday(int testDay){
        int daysofmonth[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if (testDay>0 &&testDay<=daysofmonth[month]){
                return testDay;
        }else if (month==2 &&testDay==29 && (year%400==0 || (year%4==0 && year%100!=0))){
            return testDay;
        }else{
            System.out.println("Invalid date"+ testDay + "set to 1");
            return 1;
        }
    }

    public int getDay(){
        return day;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getYear(){
        return year;
    }
    
    public void display(){
        System.out.println(month +" "+day +" " + year);
    }
}
    

