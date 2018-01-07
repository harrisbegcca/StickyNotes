
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rware {
	private static String OS = System.getProperty("os.name").toLowerCase();
	public static boolean isWindows() {

		return (OS.indexOf("win") >= 0);

	}

	public static boolean isMac() {

		return (OS.indexOf("mac") >= 0);

	}
	
	public static void Commit() {
		JFrame mainframe = new JFrame();
		JLabel commit = new JLabel();
		
		mainframe.add(commit);
		commit.setBounds(0, 0, 0, 0);
		commit.setText("");
		commit.setForeground(Color.red);
		mainframe.getContentPane().setBackground(Color.black);
		mainframe.setSize(500, 500);
		mainframe.setVisible(true);
		mainframe.setLayout(null);
		String str = "-Downloading Message: _________________";
		for (int i = 0; i < str.length(); i++) {
		char thischar = str.charAt(i);
		if (commit.getText().length() > 0) {
			commit.setText(commit.getText().substring(0, commit.getText().length()-1) + thischar + "_");
		}
		else {
			commit.setText(commit.getText() + thischar);
		}
		try {
			TimeUnit.MILLISECONDS.sleep(250);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		String command = "say " + (int) (Math.pow(2, 3) * 50)/2 + " commits!";
		if (isWindows()) {
			command = "PowerShell -Command 'Add-Type –AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('hello');'";
		}
		
		if (isMac()) {
			System.out.print("This is a mac!");
		}
        Process proc;
		try {
			proc = Runtime.getRuntime().exec(command);
			
			
			BufferedReader reader =  
		              new BufferedReader(new InputStreamReader(proc.getInputStream()));

		        String line = "";
		        try {
					while((line = reader.readLine()) != null) {
					    System.out.print(line + "\n");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		        proc.waitFor();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		
	}
}