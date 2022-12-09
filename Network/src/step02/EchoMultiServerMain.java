package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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

	}

}











