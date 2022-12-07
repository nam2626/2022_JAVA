package obj;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class PersonReadTest {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();

		try (FileInputStream fis = new FileInputStream("person.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			try {
				while (true) {
					Person p = (Person) ois.readObject();
					if (p == null)
						break;
					list.add(p);
				}
				//모든 객체를 읽어오면 EOFException을 이용해서 데이터 읽기를 종료
			} catch (EOFException e) {

			}

			System.out.println(list.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
