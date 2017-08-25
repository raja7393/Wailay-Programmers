//Author: Sukhi
//Date: 21 August 2017

package bcccp.tickets.adhoc;

import java.util.Date;

public class AdhocTicket implements IAdhocTicket {
	
	private String carparkId;
	private int ticketNo;
	private long entryDateTime;
	private long paidDateTime;
	private long exitDateTime;
	private float charge;
	private String barcode;

	
	
	public AdhocTicket(String carparkId, int ticketNo, String barcode) {
		system.out.println("Ticket number:",+ticketNo);
	}


	@Override
	public int getTicketNo() {
		int newTicketNo=ticketNo;
		return ticketNo;
	}


	@Override
	public String getBarcode() {
		
		return null;
	}


	@Override
	public String getCarparkId() {
		
		return null;
	}


	@Override
	public void enter(long dateTime) {
		String newDateTime=dateTime;
		
	}


	@Override
	public long getEntryDateTime() {
		
		return 0;
	}


	@Override
	public boolean isCurrent() {
		While(1)
		return false;
	}


	@Override
	public void pay(long dateTime, float charge) {
		String newDateTime=dateTime;
		String newFloatCharge=floatCharge;
		
	}


	@Override
	public long getPaidDateTime() {
		String newPaidDateTime=paidDateTime;
		return newPaidDateTime;
	}


	@Override
	public boolean isPaid() {
		While(1)

		return true;
	}


	@Override
	public float getCharge() {
		
		return 0;
	}


	@Override
	public void exit(long dateTime) {
		System.exit(0);
		
	}


	@Override
	public long getExitDateTime() {
		
		String newExitDateTime=exitDateTime;
		return exitDateTime;
	}


	@Override
	public boolean hasExited() {
		while(1)
		return ture;
	}

	
	
}
