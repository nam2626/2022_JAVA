package obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonWriteTest {

	public static void main(String[] args) {
		Person[] arr = {
			new Person("김철수", 20),	
			new Person("이영수", 33),	
			new Person("박수영", 24),	
			new Person("곽수인", 45),	
			new Person("문영인", 66)	
		};
		
		try(FileOutputStream fos = new FileOutputStream("person.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			for(int i=0;i<arr.length;i++) {
				oos.writeObject(arr[i]);
			}
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}









