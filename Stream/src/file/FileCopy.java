package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		File file = new File("jdk-19.0.1_doc-all.zip");
		File copy = new File("c:\\test\\copy.zip");
		
		//복사할 파일이 있는 경로가 유효한지 확인 후 없으면 해당 경로까지의 폴더 생성
		File parent = copy.getParentFile();
		if(!parent.exists()) parent.mkdirs();
		
		try(FileInputStream original = new FileInputStream(file);
			FileOutputStream copyFile = new FileOutputStream(copy);) {
			
			byte[] buffer = new byte[1024];
			while(true) {
				int size = original.read(buffer);
				if(size == -1) break;
				copyFile.write(buffer, 0, size);
				copyFile.flush();
			}
			System.out.println("파일 복사 완료"); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}









