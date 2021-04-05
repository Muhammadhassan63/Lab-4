
package lab6_activity1_runnner;


public class Lab6_Activity1_Runnner {

 
    public static void main(String[] args) {
        ABC ob1 = new ABC ();
        ABC ob2 = new ABC ();
        ob1.Var1=22;
        ob1.Var2="I am Object1";
        ob2.Var2="I am Object2";
        System.out.println("object1 integer:"+ob1.Var1);
        System.out.println("object1 String:"+ob1.Var2);
        System.out.println("object2 integer:"+ob2.Var1);
        System.out.println("object2 String:"+ob2.Var2);
    }
}
