import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Constructor {
	
	public static void main(String[] args) {
		Constructor c = new Constructor();
		c.upload();
	}
	public static void upload() {
		 
		Computer c = new Computer();
		String path = "path";
		File f = new File(path);
		f.setWritable(true);
		f.setReadable(true);
		try {
			FileReader fd = new FileReader(f);
			BufferedReader br = new BufferedReader(fd);
		    String text;
			try {
				StringBuffer stringBuffer = new StringBuffer();
				String line;
				while ((line = br.readLine()) != null) {
					stringBuffer.append(line);
					stringBuffer.append("\n");
				}
				int len = (int) br.lines().count() ;
				String[] newCPUs = stringBuffer.toString().split("\n", len);
				br.close();
				
				for (int i=0; i<newCPUs.length; i++) {
					c.computers.add(newCPUs[i]);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);

			for (int i=0; i<c.computers.size(); i++) {
				bw.append(c.computers.get(i)+"\n");
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void remove(String item, int amount) throws IOException {
		String path = "path\\to\\workspace\\HPSpectre\\src\\posts.txt";
		File f = new File(path);
		f.setReadable(true);
		Computer c = new Computer();
		f.setWritable(true);
		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter(f);
		BufferedReader br = new BufferedReader(fr);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		int sub = 0;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			if (line == (item) && amount > 0) {
				amount--;
				sub++;

			}
			else {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
		}
		int len = (int) br.lines().count() ;
		len -= sub;
		String[] newCPUs = stringBuffer.toString().split("\n", len);
		br.close();
		BufferedWriter bw = new BufferedWriter(fw);
		for (int i=0; i<newCPUs.length; i++) {
			c.computers.add(newCPUs[i]);
			bw.append(newCPUs[i]);
		}
		bw.close();
		
		
	}
}
