package bcccp.carpark;

import java.util.List;

import bcccp.tickets.adhoc.IAdhocTicket;
import bcccp.tickets.adhoc.IAdhocTicketDAO;
import bcccp.tickets.season.ISeasonTicket;
import bcccp.tickets.season.ISeasonTicketDAO;

public class Carpark implements ICarpark {
	
	private List<ICarparkObserver> observers;
	private String carparkId;
	private int capacity;
	private int numberOfCarsParked;
	private IAdhocTicketDAO adhocTicketDAO;
	private ISeasonTicketDAO seasonTicketDAO;
	
	
	
	public Carpark(String name, int capacity, 
			IAdhocTicketDAO adhocTicketDAO, 
			ISeasonTicketDAO seasonTicketDAO) {
		System.out.println("Carpark Capacity":+capacity);//prints the capacity of the carpark.
		System.out.println("Carpark ID":+carparkId);
	        System.out.println("Number of Cars":+numberofCarsParked);

String name = getName();
boolean full = isFull();


	}



	@Override
	public void register(ICarparkObserver observer) {
		
		
	}



	@Override
	public void deregister(ICarparkObserver observer) {
		
		
	}



	@Override
	public String getName() {
		
		return null;
	}



	@Override
	public boolean isFull() {
		
		return false;
	}



	@Override
	public IAdhocTicket issueAdhocTicket() {
		
		return null;
	}



	@Override
	public void recordAdhocTicketEntry() {
		return adhocTicketDAO;
		
	}



	@Override
	public IAdhocTicket getAdhocTicket(String barcode) {
		
		return null;
	}



	@Override
	public float calculateAddHocTicketCharge(long entryDateTime) {
		String entryDateTime=entryDateTime+1;
		return 0;
	}



	@Override
	public void recordAdhocTicketExit() {
		System.exit(0);
		
	}



	@Override
	public void registerSeasonTicket(ISeasonTicket seasonTicket) {
		
		String newSeasonTicket=seasonTicket;
	}



	@Override
	public void deregisterSeasonTicket(ISeasonTicket seasonTicket) {
		
		String newSeasonTicket=seasonTicket;
	}



	@Override
	public boolean isSeasonTicketValid(String ticketId) {
		if(ticketId)
	{
		return ticketId;
	}
		return false;
	}



	@Override
	public boolean isSeasonTicketInUse(String ticketId) {
		
		return false;
	}



	@Override
	public void recordSeasonTicketEntry(String ticketId) {
		
		String newticketId=ticketId;
	}



	@Override
	public void recordSeasonTicketExit(String ticketId) {
		String newticketId=ticketId;
		
	}

	
	

}
