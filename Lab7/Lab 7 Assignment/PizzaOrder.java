
package lab7_runner;

public class PizzaOrder {
    private Pizza p1 ;
    private Pizza p2 ;
    private Pizza p3 ;
    private int numOfPizza;
    
    public PizzaOrder(){
        numOfPizza = 0;
        p1 = null;
        p2 = null;
        p3 = null;
    }
    
    public void setP1(Pizza p1) {
        this.p1 = p1;
    }

    public void setP2(Pizza p2) {
        this.p2 = p2;
    }

    public void setP3(Pizza p3) {
        this.p3 = p3;
    }

    public void setNumOfPizza(int numOfPizza) {
        this.numOfPizza = numOfPizza;
    }
    
    public Pizza getP1() {
        return p1;
    }

    public Pizza getP2() {
        return p2;
    }

    public Pizza getP3() {
        return p3;
    }

    public int getNumOfPizza() {
        return numOfPizza;
    }

    public double calcTotal(){
        double cost  ;
     switch (numOfPizza) {
         case 1:
             cost = p1.totalCost();
             break;
         case 2:
             cost = p1.totalCost() + p2.totalCost();
             break;
         default: 
             cost = p1.totalCost() + p2.totalCost()+ p3.totalCost();
             break;
     }
        
        return cost ;
    }
}
    

