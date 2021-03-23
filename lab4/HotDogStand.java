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
public class HotDogStand {
    private int stand_ID;
    private int hotDogs_Sold;
    
    private static int total_HotDogsSold = 0;
	
	public HotDogStand()
	{
		stand_ID = 0;
		hotDogs_Sold = 0;
	}
	
	public HotDogStand(int newStandID, int newHotDogsSold)
	{
		stand_ID = newStandID;
		hotDogs_Sold = newHotDogsSold;
		total_HotDogsSold += newHotDogsSold;
	}
	
	public void justSold()
	{
		hotDogs_Sold++;
		total_HotDogsSold++;
	}
	
	public int getHotDogsSold()
	{
		return hotDogs_Sold;
	}
	
	public static int getTotalHotDogsSold()
	{
		return total_HotDogsSold;
	}
	
	public int getStandsID()
	{
		return stand_ID;
	}
        public void display(){
            System.out.println("\nTotal number of hot dogs sold by all hot dog stands: " + HotDogStand.getTotalHotDogsSold());	
        }
}
