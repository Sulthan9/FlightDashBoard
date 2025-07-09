package FlightDeshboard.Model;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flight {

	 @Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE)
	 private int  FlightID;
	 private String FlightName;
	 private String StartingTime;
	 private String  Duraction;
	 private String  PilotName;
	 private String  Location;
	 public Flight() {
		 
	 }
	 public Flight(int flightID, String flightName, String startingTime, String duraction, String pilotName,
			String location) {
		super();
		FlightID = flightID;
		FlightName = flightName;
		StartingTime = startingTime;
		Duraction = duraction;
		PilotName = pilotName;
		Location = location;
	}
	
	 public int getFlightID() {
		return FlightID;
	}
	public void setFlightID(int flightID) {
		FlightID = flightID;
	}
	public String getFlightName() {
		return FlightName;
	}
	public void setFlightName(String flightName) {
		FlightName = flightName;
	}
	public String getStartingTime() {
		return StartingTime;
	}
	public void setStartingTime(String startingTime) {
		StartingTime = startingTime;
	}
	public String getDuraction() {
		return Duraction;
	}
	public void setDuraction(String duraction) {
		Duraction = duraction;
	}
	public String getPilotName() {
		return PilotName;
	}
	public void setPilotName(String pilotName) {
		PilotName = pilotName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	 
}
