package spring_intro;

public class Billcollector {

	private Ipayment payment;

	public Ipayment getPayment() {
		return payment;
	}

	public void setPayment(Ipayment payment) {
		this.payment = payment;

//		payment=new Debitcardpayments();
	}

	public void collectpayment(double amount) {

		String status = payment.pay(amount);

		System.out.println(status);

	}

}
