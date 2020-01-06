package entities;

public abstract class TaxPayer {
	private double anualIncome;
	private String name;
	public TaxPayer() {
		
	}
	
	
	public TaxPayer(double anualIncome, String name) {
		this.anualIncome = anualIncome;
		this.name = name;
	}
	
	


	public double getAnualIncome() {
		return anualIncome;
	}


	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public abstract double tax();
	
	
	
	
	
	

}
