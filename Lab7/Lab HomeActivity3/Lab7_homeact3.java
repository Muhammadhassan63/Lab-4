
package lab7_homeact3;


public class Lab7_homeact3 {

    public static void main(String[] args) {
        Point p1 = new Point(8,12);
        Point p2 = new Point(6,24);
        Point p3 = new Point(40,10);
        Point p4 = new Point(36,18);
        Line linel = new Line(p1,p2);
        Line line2 = new Line(p3,p4);
        System.out.println("The Length of line 1 is:"+ linel.Length());
        System.out.println("The Length of line 2 is:"+ line2.Length());
        
    }
}