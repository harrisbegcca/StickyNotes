import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PackageTogether pkg = new PackageTogether();
		Scanner sc = new Scanner(System.in);
		//pkg.addItem("HP Spectre x360");
		System.out.println("Sticky Item: ");
		String newc = sc.nextLine();
		Main m = new Main();
		pkg.addItem(newc);
		
	}
	
	public static void search() {
		Computer c = new Computer();
		//Boolean message = c.searchArray("HP Spectre x360");
		//c.clog(message);
		c.searchURL("HPSpectre");
	}
	
	
}
