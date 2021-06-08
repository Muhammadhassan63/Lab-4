/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_12_runner;

/**
 *
 * @author abc
 */
public class Person {
    
    protected String name;
    protected String id;

        
    public Person(String name, String id)
    {
         this.name = name;
         this.id = id;          
    }
                
        

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
        

    public String toString(){
        return "\nName: " + name +
                "\nId: " + id;
        
    }
                
    }

    
    

