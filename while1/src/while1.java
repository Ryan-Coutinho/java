import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("senha invalida");
			senha = sc.nextInt();
		}
		System.out.println("acesso permitido");
		
		sc.close();

	}

}
