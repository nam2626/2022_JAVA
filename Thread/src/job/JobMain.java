package job;

import java.util.ArrayList;
import java.util.Scanner;

public class JobMain {

	public static void main(String[] args) {
		ArrayList<JobSeeker> list = new ArrayList<JobSeeker>();
		for(int i=0;i<10;i++) {
			list.add(new JobSeeker("구직자"+i));
			list.get(i).start();
		}
		
		Scanner sc = new Scanner(System.in);
		JobManager manager = new JobManager();
		for(int i=0;i<10;i++) {
			System.out.print("직업정보 입력 : ");
			String str = sc.nextLine();
			manager.writeJobManage(str);
		}
	}

}









