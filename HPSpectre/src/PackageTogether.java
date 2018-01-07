import java.util.ArrayList;

public class PackageTogether {
	
	public static void addItem(String item) {
		Constructor c = new Constructor();
		Computer newcomputer = new Computer();
		ArrayList<String> CPUs = newcomputer.computers;
		CPUs.add(item);
		c.upload();
	}
}
