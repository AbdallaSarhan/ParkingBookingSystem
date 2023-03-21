package paymentModule;

public class PaymentContext {
	
	private int CardNumber;
	private String nameOnCard;
	private int cvv;
	
	public PaymentContext(int CardNumber, String nameOnCard, int cvv) {
		this.CardNumber = CardNumber;
		this.nameOnCard = nameOnCard;
		this.cvv = cvv;
	}
	
	public int getCardNumber() {
		return CardNumber;
	}


	public void setCardNumber(int cardNumber) {
		this.CardNumber = cardNumber;
	}


	public String getNameOnCard() {
		return nameOnCard;
	}


	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}


	public int getCvv() {
		return cvv;
	}


	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

}
