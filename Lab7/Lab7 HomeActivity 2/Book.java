/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_homeact2;


public class Book {
    private Person auther_name;
    private String book_name;
    private String publisher;
    
    Book(Person author, String bookName, String publisher){
        this.auther_name = author;
        this.book_name = bookName;
        this.publisher = publisher;
    }
    
    public void setPerson(Person author){
        this.auther_name = author;
    }

    public void setBookName(String bookName) {
        this.book_name = bookName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void display(){
        
        System.out.println("Book Name: " + this.book_name + "\nPublisher : " + this.publisher);
    }
}

