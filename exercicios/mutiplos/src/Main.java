import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a < b) {
			int aux = a;
			a = b;
			b = aux;
		}
		
		if (a % b == 0) {
			System.out.println("S�O MULTIPLOS");
		} else {
			System.out.println("N�O S�O MULTIPLOS");
		}
		
		sc.close();
	}

}
