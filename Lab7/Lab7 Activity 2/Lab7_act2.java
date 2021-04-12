
package lab7_act2;


public class Lab7_act2 {

    public static void main(String[] args) {
        Date b = new Date (6,3,1992);
        Date h = new Date (8,5,2019);
        Employee e1=new Employee("xxx", "yyyy",b,h);
        e1.display();
    }
}