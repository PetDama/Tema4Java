public class Main {

	public static void main(String[] args) {
		Carte c1 = new Carte (255);
		Carte c2 = new Carte (480);
		
		if (c1.equals(c2)) {
			System.out.println("Cărțile sunt la fel");
		}
		else 
			System.out.println("Cărțile nu sunt la fel");
	}
}