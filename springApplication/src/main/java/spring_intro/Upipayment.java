package spring_intro;

public class Upipayment implements Ipayment {

	@Override
	public String pay(double amount) {

		return "money dedtied via upipayment";
	}

}
