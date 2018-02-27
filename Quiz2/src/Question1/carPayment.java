package Question1;

public class carPayment {

	double carPrice;
	double downPayment;
	int months;
	double interestRate;
	
				
	public carPayment(double carPrice, double downPayment, int months, double interestRate) {
		this.carPrice = carPrice;
		this.downPayment = downPayment;
		this.months = months;
		this.interestRate = interestRate;
	}


	
	
	public double monthlyPayment()
	{
		double mp = (this.interestRate/12 *(this.carPrice-this.downPayment))/(1-Math.pow((1+this.interestRate/12),-this.months));
		return mp;
	}
	
	public double totalInterestPaid ()
	{
		double ti =(monthlyPayment() * this.months )- (this.carPrice-this.downPayment);
		return ti;
	}
}

