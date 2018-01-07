import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

public class Computer {
	static ArrayList<String> computers = new ArrayList<String>();

	public static void createComputer(String name, int year) {
		computers.add(name);
	}
	
 
	public static void fetchComputers() {
		for(int i=0; i<computers.size();i++) {
			System.out.println(computers.get(i));
		}
	}
	public static <Message, T> void clog(T Message){
		System.out.println(Message);
	}
	
	public static void searchURL(String Computer) {
		

	    URI u2;
		try {
			u2 = new URL("https://www.google.com/search?q="+Computer+"&rlz=1C1CHBF_enUS773US773&oq=google&aqs=chrome.0.69i59j69i60l3j69i57j69i59.684j0j7&sourceid=chrome&ie=UTF-8").toURI();
		    try {
				java.awt.Desktop.getDesktop().browse(u2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static boolean searchArray(String term) {
		for(int i=0; i<computers.size(); i++) {
			if (computers.get(i).equals(term)) {
				return true;
			}
		}
		return false;
	}

	
}
