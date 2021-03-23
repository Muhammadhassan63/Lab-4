/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author abc
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       HotDogStand hot_dog1 = new HotDogStand(101, 8);
       
       HotDogStand hot_dog2 = new HotDogStand(102,12);
       HotDogStand hot_dog3 = new HotDogStand(103, 15);
		
       hot_dog1.justSold();
       hot_dog1.justSold();
       hot_dog1.justSold();
		
       hot_dog2.justSold();
       hot_dog2.justSold();
      
		
       
       hot_dog3.justSold();
       hot_dog3.justSold();
       hot_dog3.justSold();
       
		
       System.out.print("Hot Dog Stand 1 ID: ");	
       System.out.print(hot_dog1.getStandsID());
       System.out.print("\nFirst Stand Hot Dog Sold: ");
       System.out.print(hot_dog1.getHotDogsSold());
       
       System.out.print("\nHot Dog Stand 2 ID: ");	
       System.out.print(hot_dog2.getStandsID());
       System.out.print("\nSecond Stand Hot Dog Sold: ");
       System.out.print(hot_dog2.getHotDogsSold()); 
       
       System.out.print("\nHot Dog Stand 3 ID: ");	
       System.out.print(hot_dog3.getStandsID());
       System.out.print("\nThird Stand Hot Dog Sold: ");
       System.out.print(hot_dog3.getHotDogsSold());  
        
        
        

	hot_dog1.display();			
	}	
}