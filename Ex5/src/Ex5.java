import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codOne = sc.nextInt();
		int quantidadeOne = sc.nextInt();
		double valOne = sc.nextDouble();
		int codDuo = sc.nextInt();
		int quantidadeDuo = sc.nextInt();
		double valDuo = sc.nextDouble();
		double somaOne = valOne * quantidadeOne;
		double somaDuo = valDuo * quantidadeDuo;
		double total = somaOne + somaDuo;
		
		System.out.printf("Valor a pagar: R$ %.2f", total);
		
sc.close();
	}

}
