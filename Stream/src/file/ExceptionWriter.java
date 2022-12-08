package file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionWriter {

	public static void main(String[] args) {
		try {
			throw new Exception("Exception 발생");
		} catch (Exception e) {
			try(FileWriter fw = new FileWriter("exception.txt");
				PrintWriter pw = new PrintWriter(fw);){
				e.printStackTrace(pw);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}














