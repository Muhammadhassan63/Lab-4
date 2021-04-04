
package lab6_homeactivity;


public class SavingAccount {
    private static double annualInterestRate;
    private double savingBalance;
    
     public void calculateMonthlyInterest(){
        double x;
        x = savingBalance * (annualInterestRate/12);
        savingBalance += x;
    }

    public SavingAccount(double savingBalance){
        this.savingBalance = savingBalance;
    }

   

    public void modifyInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public double getSavingBalance(){
        return savingBalance;
    }
}
    

