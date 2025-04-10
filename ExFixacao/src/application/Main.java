package application;

import java.util.Scanner;
import util.CurrencyConverter;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("what is the dollar price? ");
		double dolarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dolarought = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Amount to be paid in reais = R$ %.2f%n", CurrencyConverter.conversor(dolarPrice, dolarought)) ;
		
	sc.close();
	}

}
