
package lab8_assignment1_runner;




public class Lab8_assignment1_Runner {

   
    public static void main(String[] args) {
        Book b1=new Book(100, "OOP", 1000);
              
        Tape t1=new Tape("OOP", 150, 180);
        System.out.println("     BOOK DETAILS");
        b1.display();         
        System.out.println("\n     TAPE DETAILS");
        t1.display();
        
    }
}
 