package obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteTest {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("person.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);){
			
			Person p = new Person("김철수", 20);
			
			oos.writeObject(p);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}






