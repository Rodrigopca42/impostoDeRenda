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
		
		List<TaxPayer> list = new ArrayList<>();//lista genérica onde é colocado todos os dados, não importando o tipo.
		Locale.setDefault(Locale.US);
		Scanner tec= new Scanner(System.in);
		
		System.out.print("Informe o número de contribuintes: ");
		int N = tec.nextInt();
		
		// Esse for recebe a entrada dos dados 
		for(int i = 1; i <= N; i++) {
			System.out.println();
			System.out.println("Dados do contribuinte nº" + i +":");
			System.out.print("Pessoa física ou jurídica(f/j)? ");
			char ch = tec.next().charAt(0);
			
			System.out.print("Nome do contribuinte: ");
			tec.nextLine();
			String name = tec.nextLine();
			
			System.out.print("Rendimento anual: R$");
			double anualIncome = tec.nextDouble();
			
			if (ch == 'f') {
				System.out.print("Despesas com saúde: R$");
				double healthExpenditures = tec.nextDouble();
				
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Número de funcionários: ");
				Integer numberOfEmployees = tec.nextInt();
				
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		tec.close();
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		
		for(TaxPayer tp: list) {
			System.out.println(tp.getName()+ ": R$" + String.format("%.2f", tp.tax()));
		}
		
		double sum = 0;
		for(TaxPayer tp: list) {
			sum += tp.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL DE IMPOSTOS: R$ %.2f" , sum);

	}

}
