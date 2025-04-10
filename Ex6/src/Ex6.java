import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		
		double atri = (a * c)/2;
		double acir = 3.14159 * Math.pow(c, 2);
		double atra = (a + b) * c/2;
		double aqua = b * b;
		double aret = a * b;
		
		System.out.printf("Triangulo: %.2f%n", atri);
		System.out.printf("circulo: %.2f%n", acir);
		System.out.printf("Trapezio: %.2f%n", atra);
		System.out.printf("Quadrado: %.2f%n", aqua);
		System.out.printf("Retangulo: %.2f", aret);
		
		
		sc.close();
	}

}
