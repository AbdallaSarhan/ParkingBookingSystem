package paymentModule;

import parkingBookingModule.Booking;
import userModule.Client;

public class Credit implements PaymentMethod{

	@Override
	public boolean pay(Client client, Booking booking) {
		// TODO Auto-generated method stub
		return false;
	}


}
