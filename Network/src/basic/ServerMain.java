package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			//1.Server Open
			server = new ServerSocket(1234);
			//2.Client Accept
			System.out.println("서버 오픈 완료... 사용자 접속 대기중....");
			Socket client = server.accept();//클라이언트가 접속할때기 대기 했다가 접속을 받음
			//3.Stream Init
			try(PrintWriter pw = new PrintWriter(client.getOutputStream());
				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()))){
				//4.Data Send/Receive
				String str = br.readLine();
				System.out.println("클라이언트가 보낸 메세지 : "+str);
				pw.println("서버에서 보낸 메세지");
				pw.flush();
			}catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(server != null) server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}







