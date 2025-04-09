import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double pi = 3.14159;
		
		double area = pi * Math.pow(a, 2);
		
		System.out.printf("AREA = %.4f", area);
		
		sc.close();
	}

}
