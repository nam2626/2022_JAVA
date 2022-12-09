package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoMultiServerMain {
	
	private static class ServerWorker extends Thread{
		private Socket client;
		public ServerWorker(Socket client) {
			this.client = client;
		}
		@Override
		public void run() {
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
					PrintWriter pw = new PrintWriter(client.getOutputStream());){
				while(true) {
					String str = br.readLine();
					if(str.equals("exit")) break;
					pw.println(str);
					pw.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(client.getInetAddress() +"에서 접속을 종료했습니다.");
		}
	}
	
	public static void main(String[] args) {
		ServerSocket server = null;
	
		try {
			server = new ServerSocket(1234);
			while(true) {
				System.out.println("클라이언트 접속 대기중........");
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + "에서 접속했습니다.");
				ServerWorker worker = new ServerWorker(client);
				worker.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (server != null) server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}











