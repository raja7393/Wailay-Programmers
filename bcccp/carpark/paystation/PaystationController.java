package bcccp.carpark.paystation;

import bcccp.carpark.ICarpark;
import bcccp.tickets.adhoc.IAdhocTicket;

public class PaystationController 
		implements IPaystationController {
	
	private IPaystationUI ui;	
	private ICarpark carpark;

	private IAdhocTicket  adhocTicket = null;
	private float charge;
	
	

	public PaystationController(ICarpark carpark, IPaystationUI ui) {
		//to check the ticket

           System.out.print("Please enter the hours");
           System.out.print("Please enter the price");

          
	}



	@Override
	public void ticketInserted(String barcode) {
		// TODO Auto-generated method stub
		System.out.print("Please enter the hours");
                System.out.print("Please enter the price");

	}



	@Override
	public void ticketPaid() {
		// ticket calculations
                System.out.print("Please enter the hours");
               Total=Hours*rate;
                     System.out.print(total);

		
	}



	@Override
	public void ticketTaken() {
		// TODO Auto-generated method stub
		
	}

	
	
}
