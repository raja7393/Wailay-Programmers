package bcccp.carpark.entry;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.ICarpark;
import bcccp.carpark.ICarparkObserver;
import bcccp.carpark.IGate;
import bcccp.tickets.adhoc.AdhocTicket;
import bcccp.tickets.adhoc.IAdhocTicket;

public class EntryController 
		implements ICarSensorResponder,
				   ICarparkObserver,
		           IEntryController {
	
	private IGate entryGate;
	private ICarSensor outsideSensor; 
	private ICarSensor insideSensor;
	private IEntryUI ui;
	
	private ICarpark carpark;
	private IAdhocTicket  adhocTicket = null;
	private long entryTime;
	private String seasonTicketId = null;
	
	

	public EntryController(Carpark carpark, IGate entryGate, 
			ICarSensor os, 
			ICarSensor is,
			IEntryUI ui) {
				this.carpark = carpark;
				this.entryGate = entryGate;
				this.insideSensor = is;
				this.outsideSensor = os;
	}
	



	public EntryController() {
		// TODO Auto-generated constructor stub
	}


	// adhocticket is generated when issue adhoc ticket is clicked
	@Override
	public void buttonPushed() {

		// TODO Auto-generated method stub
		AdhocTicket adt = new AdhocTicket("12345", 333, "0099999") ;
	

		
	}



	@Override
	public void ticketInserted(String barcode) {
		System.out.println("The text field input is: " +barcode);
		
		
	}



	@Override
	public void ticketTaken() {
		System.out.println("The ticker taken button");
		
	}



	 // method is used to notify the event of car entry
	@Override
	public void notifyCarparkEvent() {
		System.out.println("Notification of Car Event");
		
	}


    // This method is used to detect the car 
	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		System.out.println("Detector Id is: " +detectorId + "The car is detected: " + detected );
		
		
		// validate the detectorId and detected variable in thsi method.
		
	}

	
	
}