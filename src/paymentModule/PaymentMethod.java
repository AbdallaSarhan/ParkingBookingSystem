package paymentModule;

import parkingBookingModule.Booking;
import userModule.Client;

public interface PaymentMethod {

	public boolean pay(Client client, Booking booking);

	
	
	
	
}
