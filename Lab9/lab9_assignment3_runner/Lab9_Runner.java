/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_runner;

public class Lab9_Runner {

    public static void main(String[] args) {
        
        PhDStudent s1 = new PhDStudent("Hassan",061,19);
        s1.display();
        s1.takeExam();

        GraduateStudent s2 = new GraduateStudent("Sehar",50,20);
        s2.display();
        s2.takeExam();

    }
    
}
 