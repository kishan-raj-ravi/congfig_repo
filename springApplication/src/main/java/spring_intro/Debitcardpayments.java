package spring_intro;

public class Debitcardpayments implements Ipayment {

	@Override
	public String pay(double amount) {

		return "money gotted via depitcard ";
	}

}
