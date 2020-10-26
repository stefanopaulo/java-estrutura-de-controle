
public class Main {

	public static void main(String[] args) {
		double price = 35.5;
		double discount = (price < 20.0) ? price * 0.1 : price * 0.05;
		
		System.out.println("Desconto: " + discount);
	}

}
