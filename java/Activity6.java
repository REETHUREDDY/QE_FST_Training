package Activity;

import java.util.*;

class Plane{
	
private List<String> passenger;
private final int maxPassengers;
private Date lastTimeTookOff;
private Date lastTimeLanded;

public Plane(int maxPassengers) {
	this.maxPassengers = maxPassengers;
	this.passenger = new ArrayList();
}
public void onBoard(String passengerName) {
	if(passenger.size() <= maxPassengers) {
		this.passenger.add(passengerName);
	}
	else {
		System.out.println("Plane is full");
	}
}
public Date setTakeOff() {
	this.lastTimeTookOff = new Date();
	return lastTimeTookOff;
}
public void setLand() {
	this.lastTimeLanded = new Date();
	this.passenger.clear();
}
public Date getLastTimeLanded() {
	return lastTimeLanded;
}
public List<String> getPassenger(){
	return passenger;
}
}
public class Activity6 {
	public static void main(String[] args) throws InterruptedException{
		
		Plane plane = new Plane(10);
		
		plane.onBoard( "John");
		plane.onBoard("Steve");
		plane.onBoard("Anna");
		
		System.out.println("Plane took off at: " + plane.setTakeOff());
		System.out.println("People on the plane: " + plane.getPassenger());
		
		Thread.sleep(5000);
		
		plane.setLand();
		
		System.out.println("Plane landed at: " + plane.getLastTimeLanded());
		System.out.println("People on the plane after landing: " + plane.getPassenger());
		}
}
