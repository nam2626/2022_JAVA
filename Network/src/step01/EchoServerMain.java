package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			server = new ServerSocket(1234);
			System.out.println("클라이언트 접속 대기중........");
			Socket client = server.accept();
			System.out.println(client.getInetAddress() + "에서 접속했습니다.");

			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));

			while (true) {
				String str = br.readLine();
				if (str.equals("exit"))
					break;
				pw.println(str);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null)pw.close();
				if (br != null)br.close();
				if (server != null) server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

