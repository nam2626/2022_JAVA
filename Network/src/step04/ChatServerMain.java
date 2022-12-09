package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerMain {

	private static ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();

	private static class ServerWorker extends Thread {
		private Socket client;
		private BufferedReader br;
		private PrintWriter pw;

		public ServerWorker(Socket client) {
			this.client = client;
			try {
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				pw = new PrintWriter(client.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void sendMessage(String str) {
			pw.println(str);
			pw.flush();
		}

		@Override
		public void run() {
			try {
				while (true) {
					String str = br.readLine();// 클라이언트가 보낸 내용을 받음
					if(str.equals("exit")) break;
					broadCastMessage(client.getInetAddress() + "님의 메세지 : " + str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				//사용자가 접속 종료 후 처리할 코드
				list.remove(this); // 리스트에서 현재 Worker를 제거
				System.out.println(client.getInetAddress() + "에서 접속을 종료했습니다.");
				System.out.println(String.format("현재 %d명 접속 중입니다.", list.size()));
			} 
		}
	}
	//모든 클라이언트에게 메세지를 보내는 메서드
	public static void broadCastMessage(String string) {
		for(int i=0;i<list.size();i++)
			list.get(i).sendMessage(string);
	}

	public static void main(String[] args) {
		// 1. 서버 오픈
		try (ServerSocket server = new ServerSocket(1234);) {
			System.out.println("서버 오픈 완료!!!");

			while (true) {
				// 2. 클라이언트 접속
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + "에서 접속 했습니다.");
				// 3. 스레드 생성해서 시작 후 리스트에 추가
				ServerWorker worker = new ServerWorker(client);
				worker.start();
				list.add(worker);
				System.out.println(String.format("현재 %d명 접속 중입니다.", list.size()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
