package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OneChatServerMain {
	private static class ServerWorker extends Thread{
		private Socket client;
		
		public ServerWorker(Socket client) {
			this.client = client;
		}

		@Override
		public void run() {
			try(BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()))){
				while(true) {
					String str = br.readLine();
					if(str.equals("exit")) break;
					System.out.println(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(1234);
			System.out.println("서버 오픈 완료");
			Socket client = server.accept();
			System.out.println(client.getInetAddress() + "에서 접속을 하였습니다.");
			
			ServerWorker worker = new ServerWorker(client);
			worker.start();
			
			try(Scanner sc = new Scanner(System.in);
					PrintWriter pw = new PrintWriter(client.getOutputStream())){
				while(true) {
					System.out.print("메세지 입력 : ");
					String str = sc.nextLine();
					pw.println(str);
					pw.flush();
					if(str.equals("exit"))break;
				}
				
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}







