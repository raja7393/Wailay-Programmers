package bcccp.carpark.exit;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.ICarpark;
import bcccp.carpark.IGate;
import bcccp.tickets.adhoc.IAdhocTicket;

public class ExitController 
		implements ICarSensorResponder,
		           IExitController {
	
	private IGate exitGate;
	private ICarSensor insideSensor;
	private ICarSensor outsideSensor; 
	private IExitUI ui;
	
	private ICarpark carpark;
	private IAdhocTicket  adhocTicket = null;
	private long exitTime;
	private String seasonTicketId = null;
	private ICarSensor is;
	private ICarSensor os;
	
	

	public ExitController(Carpark carpark, IGate exitGate, 
			ICarSensor is,
			ICarSensor os, 
			IExitUI ui) {
		this.carpark = carpark;
		this.exitGate = exitGate;
		this.is = insideSensor;
		this.os = outsideSensor;
	}

//New constructor with no arguments , need to add parameters later on
	public ExitController() {
	
	}

	@Override
	public void ticketInserted(String ticketStr) {
		System.out.println("The ticket String is:" +ticketStr);
		
	}



	@Override
	public void ticketTaken() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		System.out.println("car detected? " +detected + "the detector Id is: " +detectorId );
		
	}

	
	
}