package bcccp.tickets.season;

import bcccp.tickets.season.ISeasonTicket;
import bcccp.tickets.season.IUsageRecordFactory;

public class SeasonTicketDAO implements ISeasonTicketDAO {

	private IUsageRecordFactory factory;

	
	
	public SeasonTicketDAO(IUsageRecordFactory factory) {
		System.out.println("Usage record:"+ factory);
		System.out.println("Type of vehicle:"+ type);
		System.out.println("Name of maker:"+name);
		System.out.println("Number of vehicle:"+number);
		System.out.println("Name of Owner:"+ownername);
	}



	@Override
	public void registerTicket(ISeasonTicket ticket) {
		System.out.println("Ticket Number:"+ ticketNumber);
		System.out.println("Time of ticket generation:"+ time);
		
		
	}



	@Override
	public void deregisterTicket(ISeasonTicket ticket) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public int getNumberOfTickets() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public ISeasonTicket findTicketById(String ticketId) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void recordTicketEntry(String ticketId) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void recordTicketExit(String ticketId) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
