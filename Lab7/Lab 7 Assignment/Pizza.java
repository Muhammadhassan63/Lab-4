/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_runner;

/**
 *
 * @author abc
 */
public class Pizza {
    private String pizzasize;
    private int cheese_toppings;
    private int pepperoni_Toppings;
    private int ham_toppings;
      
    Pizza(String pizzasize,int cheesetoppings, int pepperoniToppings,int hamtoppings){
        this.pizzasize=pizzasize;
        this.cheese_toppings=cheesetoppings;
        this.pepperoni_Toppings=pepperoniToppings;
        this.ham_toppings=hamtoppings;
    }

    
    public String getPizzasize() {
        return pizzasize;
    }

    
    public void setPizzasize(String pizzasize) {
        this.pizzasize = pizzasize;
    }

    public int getCheesetoppings() {
        return cheese_toppings;
    }

    
    public void setCheesetoppings(int cheesetoppings) {
        this.cheese_toppings = cheesetoppings;
    }

    
    public int getPepperoniToppings() {
        return pepperoni_Toppings;
    }

    
    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoni_Toppings = pepperoniToppings;
    }

    
    public int getHamtoppings() {
        return ham_toppings;
    }

    
   
    public void setHamtoppings(int hamtoppings) {
        this.ham_toppings = hamtoppings;
    }
    
    public double totalCost(){
        double pizza_Cost = 0;
        if(this.pizzasize.equalsIgnoreCase("Small")){
            pizza_Cost= 10 + (this.cheese_toppings*2) + (this.ham_toppings*2) + (this.pepperoni_Toppings*2); 
        }else if(this.pizzasize.equalsIgnoreCase("Medium")){
            pizza_Cost =12 + (this.cheese_toppings*2) + (this.ham_toppings*2) + (this.pepperoni_Toppings*2) ;
            
        } else if(this.pizzasize.equalsIgnoreCase("Large")){
              pizza_Cost =14 + (this.cheese_toppings*2) + (this.ham_toppings*2) + (this.pepperoni_Toppings*2) ;
        }
        
        return pizza_Cost;
    }
    
    public String getDescription(){
        return String.format("Pizza size = %s \nCheese Toppings = %d \nPepperoniToppings = %d \nHam Toppings = %d",pizzasize,cheese_toppings,pepperoni_Toppings,ham_toppings);
        
    }
}
    

