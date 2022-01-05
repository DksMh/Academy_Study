package day16ch08_02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// ObjectInputStream으로 읽어오기
		// ObjectOutputStream으로 기록함
		//파일 만들기
		File file = new File("C:\\Users\\Administrator\\saram.dat");
		FileOutputStream fos = new FileOutputStream(file);
		FileInputStream fis = new FileInputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// 객체 만들기
		Saram data = new Saram(1,"홍길동","hong@h.com");
		
		oos.writeObject(data); 
		System.out.println("객체 저장 완료!");
		
		Saram saram =(Saram) ois.readObject();
		System.out.println(saram);
		

	}

}
