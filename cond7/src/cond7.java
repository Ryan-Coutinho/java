import java.util.Scanner;

public class cond7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double imposto;
		
		if( salario <= 2000) {
			System.out.println("ISENTO");
		}else if(salario > 2000 && salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
			System.out.printf("TOTAL R$ %.2f", imposto);
		}else if(salario > 3000 && salario <= 4000) {
			imposto = ((salario - 3000)* 0.18 +  1000 * 0.08);
			System.out.printf("TOTAL R$ %.2f", imposto);
		}else if(salario >= 4500) {
			imposto = ((salario - 4500)* 0.28 +  1500 * 0.18 + 1000 * 0.08);
			System.out.printf("TOTAL R$ %.2f", imposto);
		}
		
sc.close();
	}

}
