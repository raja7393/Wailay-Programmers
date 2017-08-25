package bcccp.carpark.exit;

public interface IExitUI {

	public void registerController(IExitController controller);
	public void deregisterController();
	public void display(String message);
	public void beep();
	public void discardTicket();	
	
	System.out.println(beep);
	System.out.println(discardTicket);
	System.out.println(display);
}
