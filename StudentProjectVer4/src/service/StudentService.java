package service;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();
	private ArrayList<StudentVO> list;
	
	private StudentService() {
		fileLoad();
	}

	private void fileLoad() {
		list = new ArrayList<StudentVO>();
		
		try(FileInputStream fis = new FileInputStream("student.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);){
			while(true) {
				StudentVO vo = (StudentVO) ois.readObject();
				list.add(vo);
			}
		} catch (FileNotFoundException e) {
			System.out.println("학생 데이터 파일이 없습니다.");
		}catch (EOFException e) {
			System.out.println("학생 데이터 파일 로드 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
	}
	
	public void fileSave() {
		try(FileOutputStream fos = new FileOutputStream("student.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
			
			for(int i=0;i<list.size();i++)
				oos.writeObject(list.get(i));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}
	
	public ArrayList<StudentVO> getList() {
		return list;
	}

	//학생정보 추가
	public void appendStudentVO(StudentVO studentVO) {
		//받아온 학생 객체를 리스트에 추가.
		list.add(studentVO);
		//파일에 내용 추가
		fileSave();
	}

	public StudentVO searchStudentVO(String studentNo) {
		int i = list.indexOf(new StudentVO(studentNo, null, null, 0));
		if(i != -1)
			return list.get(i);
		return null;
	}

	public boolean deleteStudentVO(StudentVO studentVO) {
		return list.remove(studentVO);
	}
	//csv로 학생 정보 내용 저장
	public void exportCSV() {
		
	}
	
}













