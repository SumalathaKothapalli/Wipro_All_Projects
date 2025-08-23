package File_handling;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrintWriter_use {

	public static void main(String[] args) {
		try {
			PrintWriter w=new PrintWriter(new FileWriter("sample.txt"));
			w.write("Hello");
			w.newLine();
			w.write("Welcome to JAVA Learning Sessions");
			w.close();
			System.out.println("Write file successfully");
			} catch (IOException e) {
				e.printStackTrace();
			}
		

	}

}
