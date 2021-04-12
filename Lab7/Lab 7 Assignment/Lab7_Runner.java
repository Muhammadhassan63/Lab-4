

package lab7_runner;

public class Lab7_Runner {

    
    public static void main(String[] args) {
        Pizza p1 = new Pizza("small",2,0,2);
        Pizza p2 = new Pizza("medium",2,2,0);
        p1.getDescription();
        p2.getDescription();
        System.out.println("      BILL  \nPizza1: "+ p1.totalCost()+("\nPizza2: "+p2.totalCost()));
        
        PizzaOrder obj = new PizzaOrder();
        obj.setNumOfPizza(2);
        obj.setP1(p1);
        obj.setP2(p2);
        System.out.println("Total Ammount of order of "+obj.getNumOfPizza()+" Pizza is " + obj.calcTotal()+"$");
    }
    
}
        
