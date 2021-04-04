/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_homeactivity;


public class Lab6_homeactivity {

    
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000.00);
        SavingAccount saver2 = new SavingAccount(3000.00);
        System.out.println("The annual interest rate is 3%");
        saver1.modifyInterestRate(3);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("The saving balance for saver1 with monthly interest of 3% is : "+saver1.getSavingBalance());
        System.out.println("The saving balance for saver2 with monthly interest of 3% is : "+saver2.getSavingBalance());

        
        System.out.println("\nThe annual interest rate is 4%");
        saver2.modifyInterestRate(4);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("The saving balance for saver1 with monthly interest of 4% is : "+saver1.getSavingBalance());
        System.out.println("The saving balance for saver2 with monthly interest of 4% is : "+saver2.getSavingBalance());

    }
}
