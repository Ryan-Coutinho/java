package util;

public class CurrencyConverter {

	public static double conversor(double dolarPrice, double dolarBought) {
		double soma = dolarPrice * dolarBought;
		return soma * 0.06 + soma;
	}
}
