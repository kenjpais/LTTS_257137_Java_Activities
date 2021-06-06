package test;

import java.util.*;

public class test{

	
	    public static void main(String[] args){
	    	
	    	//UserInput
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	int choice; 
	    
	        System.out.println("Hotel Tariff Calculator");
	        choice = sc.nextInt();
	        
	        /*Menu 
	         *1.DeluxeRoom
	         *2.DeluxeACRoom
	         *3.SuiteACRoom 
	         */
	        
	        switch(choice) {
	        
	        case 1: HotelRoom H = new HotelRoom("Taj",320,true,true);
	        H.calculateTariff();
	        System.out.println(H.getRatePerSqFeet());
	        break;
	        
	        case 2:DeluxeRoom D = new DeluxeRoom("TAE",5757,false,true);
	        D.calculateTariff();
	        System.out.println(D.getRatePerSqFeet());
	        break;
	        
	        case 3:DeluxeACRoom DA= new DeluxeACRoom("YSH",4567,false,true);
	        DA.calculateTariff();
	        System.out.println(DA.getRatePerSqFeet());
	        break;
	        default: System.out.println("Error");	 
	        
	        }
	        sc.close();
        }

	        
	        
	    }