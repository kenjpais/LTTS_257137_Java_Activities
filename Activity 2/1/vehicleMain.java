import java.util.*(
import java.io.*;
class vehicleMain
{	
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 		
System.out.println("Type of vehicle: \n 1. Four Wheeler \n 2. Two Wheeler\n");
		int type = sc.nextInt(); 		
if(type == 1){ 
sc.nextLine();	

System.out.println("Vehicle make:");			
String vname = sc.nextLine(); 			
System.out.println("Vehicle number:");			
String vnum = sc.nextLine(); 			
System.out.println("Fuel Type: \n 1. Petrol \n 2. Diesel\n");			
String fueltype = sc.nextLine();	 			
System.out.println("Fuel capacity:");			
int fuelcap = sc.nextInt();	 			
System.out.println("Engine CC:");			
int cc = sc.nextInt();				
sc.nextLine(); 			
System.out.println("Audio system:");			
String audio = sc.nextLine();	 			
System.out.println("Number of Door:");		
int noD = sc.nextInt(); 			
FourWheeler fourWheeler = new FourWheeler(vname,vnum,fueltype,fuelcap,cc,audio,noD); 
			
fourWheeler.displayBasic();			
fourWheeler.displayDetailInfo();
} 		
if(type == 2){
sc.nextLine();

			
System.out.println("Vehicle make:");
			
String vname = sc.nextLine();
 
System.out.println("Vehicle number:");			
String vnum = sc.nextLine(); 			
System.out.println("Fuel Type: \n 1. Petrol \n 2. Diesel\n");
			
String fueltype = sc.nextLine();	 			
System.out.println("Fuel capacity:");			
int fuelcap = sc.nextInt();	 			
System.out.println("Engine CC:");			
int cc = sc.nextInt();
				
sc.nextLine(); 			
System.out.println("Kick Start available(Yes/No):");			
String kick = sc.nextLine();	 
TwoWheeler twoWheeler = new TwoWheeler(vname,vnum,fueltype,fuelcap,cc,kick); 			
twoWheeler.displayBasic();			
twoWheeler.displayDetailInfo();
		 		} 	}}