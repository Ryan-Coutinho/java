import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario = sc.nextInt();
		double horaTrabalhada = sc.nextDouble();
		double valorHora = sc.nextDouble();
		double salario = horaTrabalhada * valorHora;
		
		System.out.println("Number: "+ numeroFuncionario);
		System.out.printf("Salary = U$ %.2f", salario);
		
sc.close();
	}

}
