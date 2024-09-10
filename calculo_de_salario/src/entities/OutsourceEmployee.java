package entities;

public class OutsourceEmployee extends Employee {

	private double additionalCharge;

	public OutsourceEmployee() {
		super();
	}

	public OutsourceEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public final double payment() {
		return super.payment() + additionalCharge * 1.1;	
	}
}
