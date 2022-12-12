import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Random;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			server = new ServerSocket(5000);
			
			Socket client = server.accept();
			
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
			
			String msg = br.readLine();
			
			int ea = Integer.parseInt(msg);
			
			String str = new String();
			
			Random r = new Random();
			for(int i=0;i<ea;i++) {
				HashSet<Integer> set = new HashSet<Integer>();
				while(set.size() < 6)
					set.add(r.nextInt(45)+1);
				str = String.format("%d set : %s\t", i+1, set.toString()) + str; 
			}
			System.out.println(str);
			pw.println(str);
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null)br.close();
				if(pw!=null)pw.close();
				if(server!=null)server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}








