package bcccp.carpark.entry;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.ICarpark;
import bcccp.carpark.ICarparkObserver;
import bcccp.carpark.IGate;
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
		System.out.println("Carpark Capacity":+carparkId);
	        System.out.println("Carpark Capacity":+numberofCarsParked);
	}



	@Override
	public void buttonPushed() {
		System.out.println("Button pressed");
	      
		
	}



	@Override
	public void ticketInserted(String barcode) {
		
		System.out.println("Ticket is inserted");	
	}



	@Override
	public void ticketTaken() {
		System.out.println("Ticket Taken");
		
	}



	@Override
	public void notifyCarparkEvent() {
		System.out.println("Car is parked");
		
	}



	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		System.out.println("Car is detetcted");
		
	}

	
	
}
