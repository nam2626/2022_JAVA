package io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataReadTest {

	public static void main(String[] args) {
		try(
			FileInputStream fis = new FileInputStream("data.dat");
			DataInputStream dis = new DataInputStream(fis);
		){
			int n = dis.readInt();
			double d = dis.readDouble();
			char ch = dis.readChar();
			boolean b = dis.readBoolean();
			
			System.out.println(n + " " + d + " " + ch + " " + b);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}









