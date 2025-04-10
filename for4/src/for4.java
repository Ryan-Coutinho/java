import java.util.Scanner;

public class for4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			if(b == 0) {
				System.out.println("divisao impossivel");
			}else {
				double soma = a / b;
				System.out.printf("%.1f%n", soma);
			}
		}
		
		sc.close();

	}

}
