
package lab5.runner;


public class Fraction {
    double num1, num2;
    double fraction;
    Fraction(){

    }
    Fraction(double x, double y){
        num1 = x;
        num2 = y;

    }
    public void display(){
        fraction = num1/num2;
        System.out.println(fraction);
    }
    public boolean equals(double a, double b){
      double output = a / b;
    if(output == fraction){
        System.out.println("True");
        return true;
}
        System.out.println("False");
        return false;

    }

}