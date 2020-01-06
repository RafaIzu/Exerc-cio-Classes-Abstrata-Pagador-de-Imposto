package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		List<TaxPayer>list=new ArrayList<>();
		
		System.out.print("Enter the number of tax payer: ");
		int num=sc.nextInt();
		
		for (int i=0;i<num;i++) {
			System.out.println("Tax payer #"+(i+1)+" data: " );
			System.out.print("Individual or company(i/c)? ");
			char option=sc.next().charAt(0);
			if(option=='i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome=sc.nextDouble();
				System.out.print("Health expenditures: ");
				double healthExpenditures=sc.nextDouble();
				list.add(new Individual(anualIncome, name, healthExpenditures));
			}
			else {
				System.out.print("Name: ");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome=sc.nextDouble();
				System.out.print("Number of employees: ");
				int numberOfEmployees=sc.nextInt();
				list.add(new Company(anualIncome, name, numberOfEmployees));
				
			}

			
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		for(TaxPayer p:list) {
			System.out.println(p.getName()+": $ "+String.format("%.2f", p.tax()));
		}
		
		System.out.println();
		
		double sum=0;
		for(TaxPayer p:list) {
			sum+=p.tax();
		}
		System.out.println("TOTAL TAXES: $ "+String.format("%.2f", sum));
		
		
		sc.close();
	}

}
