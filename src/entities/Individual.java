package entities;

public class Individual extends TaxPayer {
	private double HealthExpenditures;
	public Individual() {
		super();
	}

	
	public Individual(double anualIncome, String name, double healthExpenditures) {
		super(anualIncome, name);
		HealthExpenditures = healthExpenditures;
	}
	
	
	public double getHealthExpenditures() {
		return HealthExpenditures;
	}


	public void setHealthExpenditures(double healthExpenditures) {
		HealthExpenditures = healthExpenditures;
	}


	@Override
	public final double tax() {
		double result=0;
		
		if (super.getAnualIncome()<20000) {
			result=(super.getAnualIncome()*0.15)-(HealthExpenditures*0.5);
		}
		else {
			result=(super.getAnualIncome()*0.25)-(HealthExpenditures*0.5);
		}
		return result;
	}
	

}
