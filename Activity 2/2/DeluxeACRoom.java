package test;

public class DeluxeACRoom extends DeluxeRoom {
	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hastv,boolean hasWifi) {
		super(hotelName,numberOfSqFeet,hastv,hasWifi);
		this.ratePerSqFeet=12;
	}
	public int calculateTariff() {
		this.ratePerSqFeet=numberOfSqFeet*ratePerSqFeet;
		return 0;
		
	}
}
