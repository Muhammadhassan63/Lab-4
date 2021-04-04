/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author abc
 */
public class Calculator {
    
  public static double num1;
  public static double num2;
 
  public static void Sum(){
      double sum=num1+num2;
      System.out.println("The Sum of two number is: "+sum);
  }
  public static void  Multiply(){
      double multiply=num1*num2;
      System.out.println("The multiplication of two numbers is: "+multiply);
  }
  public static void Divide() {
      double divide=num1 / num2;
      System.out.println("The division of two numbers is: "+divide);
  } 
  public static void Modulus (){
      double modulus=num1 % num2;
      System.out.println("The modulus of two numbers is: "+modulus);
  } 
  public static void Tan (){
      double tan_num1=Math.tan(num1);
       double tan_num2=Math.tan(num2);
       System.out.println("The Tan of 15 is: "+tan_num1+"\n"+"The Tan of 5 is: "+tan_num2);
  } 
  public static void Sin (){
      double sin_num1=Math.sin(num1);
       double sin_num2=Math.sin(num2);
       System.out.println("The Sin of 15 is : "+sin_num1+"\n"+"The Sin of 5 is : "+sin_num2);
  } 
  public static void Cos(){
      double cos_num1=Math.cos(num1);
       double cos_num2=Math.cos(num2);
       System.out.println("The Cos of 15 is : "+cos_num1+"\n"+"The Cos of 5 is : "+cos_num2);
  } 
  
}
    
