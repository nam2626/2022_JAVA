package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OneChatClientMain {
	
	public static void main(String[] args) {
		
		try(Socket server = new Socket("127.0.0.1",1234);) {
			System.out.println("서버 접속 완료");

			Thread t = new Thread(()->{
				try(BufferedReader br = new BufferedReader(
						new InputStreamReader(server.getInputStream()))){
					
					while(true) {
						String str = br.readLine();
						if(str.equals("exit")) break;
						System.out.println(str);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			t.start();
			
			try(Scanner sc = new Scanner(System.in);
					PrintWriter pw = new PrintWriter(server.getOutputStream())){
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







