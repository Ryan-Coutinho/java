import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0  && y > 0) {
				System.out.println("primeiro");
				 x = sc.nextInt();
				 y = sc.nextInt();
			}else if(x < 0  && y > 0) {
				System.out.println("segundo");
				 x = sc.nextInt();
				 y = sc.nextInt();
			}else if(x < 0  && y < 0) {
				System.out.println("terceiro");
				 x = sc.nextInt();
				 y = sc.nextInt();
			}else {
				System.out.println("quarto");
				 x = sc.nextInt();
				 y = sc.nextInt();
			}
		}
		
		sc.close();

	}

}
