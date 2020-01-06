package entities;

public class Company extends TaxPayer {
	private int numberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(double anualIncome, String name, int numberOfEmployees) {
		super(anualIncome, name);
		this.numberOfEmployees = numberOfEmployees;
	}



	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}



	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}



	@Override
	public final double tax() {
		double result=0;
		if (numberOfEmployees<10) {
			result=super.getAnualIncome()*0.16;
			
		}
		else {
			result=super.getAnualIncome()*0.14;
		}
		return result;
		
	}
	
	

}
