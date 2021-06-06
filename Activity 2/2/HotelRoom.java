package test;

public class HotelRoom{
	
protected String hotelName;
protected int numberOfSqFeet,ratePerSqFeet;
public boolean hasTV,hasWifi;

public HotelRoom(String hotelName, int numberOfSqFeet,boolean hasWifi, boolean hasTV){
	this.hasWifi=hasWifi;
	this.hasTV=hasTV;
	this.hotelName=hotelName;
	this.numberOfSqFeet=numberOfSqFeet;
}

public int calculateTariff(){
	this.ratePerSqFeet=numberOfSqFeet*70;
	return 0;
	
}

public int getRatePerSqFeet() {
	if(hasWifi){
		return this.ratePerSqFeet+2;
}
	else{
		return this.ratePerSqFeet;
	}
}
}
