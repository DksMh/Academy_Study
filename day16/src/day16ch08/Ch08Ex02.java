package day16ch08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class Ch08Ex02 {
	
	
	
	// 객체를 파일에 저장하고 객체로 읽어온다.
	// 자바는 객체 지향 언어이므로 객체 저장이 더 효과적이다.
	// 객체 직렬화 - 객체를 저장하고 읽을 때 필요한 개념.
	// 만약 객체를 집에 비유한다면 ... 
	
	public static void main(String[] args) throws IOException {
		// UTF로 기록하고
		File file = new File("C:\\Users\\Administrator\\data2.txt");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("저장할 문장을 입력하세요 >> ");
		String ins = null;
		StringBuffer stringData = new StringBuffer();
		while((ins = br.readLine()) != null) {
			if(ins.equals("그만")) {
				break;
			}
			stringData.append(ins);
			stringData.append("\n");			
		}			
		dos.writeUTF(stringData.toString());			
		dos.close();
		// UTF읽기 호출
		test_dis(null);
		
	}
	public static void test_dis(String[] args) throws IOException {
		// DataInputStream
		File file = new File("C:\\Users\\Administrator\\data2.txt");
		FileInputStream fis = new FileInputStream(file); 
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String s = null;
		try {
			s = dis.readUTF(); // UTF로 기록된 데이터를 읽어온다.
			System.out.println(s);
		} catch (IOException e) {
			System.out.println("UTF 읽기 오류 발생");
		}finally {
			dis.close();
		}
		
	}
	
	public static void text08(String[] args) throws IOException {
		File file = new File("C:\\Users\\Administrator\\data2.txt"); // 파일 생성
		FileReader fr = new FileReader(file);
		
		char[] cbuf = new char[255];
		fr.read(cbuf);
		System.out.println(new String(cbuf).trim());
		
		fr.close();
	}
	public static void test07(String[] args) throws IOException {
		File file = new File("C:\\Users\\Administrator\\data2.txt"); // 파일 생성
		FileWriter fw = new FileWriter(file);
		// 키보드로 데이터를 입력 받아서 fw를 이용해서 data2.txt파일에 기록하기
		// 선생님이랑 한 것
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		fw.write(s);
		fw.close();
		
		// 키보드로 받기 전 확인
//		String s = "Hello world! 안녕하세요";
//		fw.write(s);		
//		fw.close();
		
		System.out.println("파일 작성을 완료했습니다.");
	}

	public static void test06(String[] args) throws IOException {
		File file = new File("C:\\Users\\Administrator\\data.txt");
		FileReader fr = new FileReader(file); // 한글이나 한문은 ㄱ ㅏ ㅇ 으로 하나하나씩 읽음

		BufferedReader br = new BufferedReader(fr); // 강으로 합침

		String s = null;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
	}

	public static void test05(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\Administrator\\data.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}

	public static void test04(String[] args) throws IOException {
		// File
		File file = new File("C:\\Users\\Administrator"); // \\test_my_file.txt
		if (file.exists()) {
			System.out.println("경로가 있다.");
			if (file.isDirectory()) {
				String[] fileList = file.list();
				for (String fileName : fileList) {
					System.out.println(fileName);
				}
			} else {
				if (file.delete()) { // 파일삭제
					System.out.println("파일이 삭제되었습니다.");
				}
			}
		} else {
			System.out.println("경로가 없다.");
			if (file.createNewFile()) { // 파일 생성
				System.out.println("파일이 생성되었습니다.");
			}
		}
	}

	public static void test03(String[] args) throws IOException { // FileNotFoundException -> IOException 의 자식
		// 파일에서 데이터 읽어오기
		// InputStream is = System.in; 대신 쓰는 것
		File file = new File("C:\\Users\\Administrator\\data.txt");
		FileInputStream is = new FileInputStream(file);
		int data = 0;
		while ((data = is.read()) != -1) {
			System.out.write(data);
		}
		is.close();
		System.out.println("파일 읽기 완료!");

	}

	public static void test02(String[] args) throws IOException {
		// test01(null);
		// OutputStream os = System.out;
		// 파일로 바꿈
		FileOutputStream os = new FileOutputStream("C:\\Users\\Administrator\\data.txt"); // 열기
		InputStream is = System.in;

		// int data = is.read(); // 아스키코드 a(97), A(65), 0(48), \n(13) -> 한글자만 들어옴
		// System.out.println(data);
		System.out.println("데이터를 입력해보세요. (끝내려면 Ctrl+z) : ");
		int data = 0;
		while ((data = is.read()) != -1) { // EOF(End Of File)일 때까지 (ctrl+Z)
			os.write(data); // 넣기
		}
		os.close(); // 닫기
		System.out.println("입력 종료!");
	}

	public static void test01(String[] args) throws IOException {
		OutputStream os = System.out; // 업캐스팅
//		PrintStream os = System.out;
		byte[] by = new byte[255];

		System.out.print("문자입력 >> ");
		System.in.read(by);

		String s = new String(by).trim();

		os.write(s.getBytes());

		// PrintStream os = System.out; (29줄 공부)
		int b = 0;
		while ((b = System.in.read()) != '\n') {
//			os.print(b); // 아스키 값
//			os.print((char)b);
//			System.out.print((char)b); // 윗 줄과 동일

		}
	}
}
