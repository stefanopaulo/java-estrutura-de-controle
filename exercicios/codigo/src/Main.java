import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int quant = sc.nextInt();
		double price;
		
		switch (cod) {
			case 1:
				price = quant * 4.0;
				break;
			case 2:
				price = quant * 4.5;
				break;
			case 3:
				price = quant * 5.0;
				break;
			case 4:
				price = quant * 2.0;
				break;
			case 5:
				price = quant * 1.5;
				break;
			default:
				price = 0;
		}
		
		System.out.printf("Total: R$ %.2f", price);
		
		sc.close();
	}

}
