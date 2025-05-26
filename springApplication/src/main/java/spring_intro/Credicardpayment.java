package spring_intro;

public class Credicardpayment implements Ipayment {

	@Override
	public String pay(double amount) {

		return "successfully money tanrsfered via creditcard";
	}

}
