package bcccp.tickets.adhoc;

import java.util.List;

public class AdhocTicketDAO  implements IAdhocTicketDAO  {

	private IAdhocTicketFactory factory;
	private int currentTicketNo;

	
	
	public AdhocTicketDAO(IAdhocTicketFactory factory) {
		
		system.out.println("Ticket number:",+currentTicketNo);
	}



	@Override
	public IAdhocTicket createTicket(String carparkId) {
		String newcarparkid=carparkid;
		return null;
	}



	@Override
	public IAdhocTicket findTicketByBarcode(String barcode) {
		system.out.println("Barcode:",+barcode);
		return null;
	}



	@Override
	public List<IAdhocTicket> getCurrentTickets() {
		 
		String total_tickets=getcurrentTickets();
		if (size == total_tickets.length) {
		 elements = Arrays.copyOf(total_tickets, newSize);
}
		return null;
	}

	
	
}
