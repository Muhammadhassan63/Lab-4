/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_assignment1_runner;

public class Book extends Publication {
    public int pageCount;
    
    public Book(int pageCount, String title, double price){
       super( title,  price);
        this.pageCount=pageCount;
     
    }

 
    public int getPageCount() { 
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public void display(){
        System.out.println("Total pages : "+this.pageCount);
        super.display();
     
    }

}