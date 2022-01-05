package day16ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch08Ex01_2 {

	public static void main(String[] args) throws IOException {
		InputStreamReader ips = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ips);
		
		System.out.print("성명 입력 : ");
		String name = br.readLine();
		
		System.out.print("주소 입력 : ");
		String addr = br.readLine();
		
		System.out.print("나이 입력 : ");
//		int age = br.read(); 
		// 엔터(아스키 값)랑 같이 합쳐져서 30을 치면 51이 나옴 그래서 parseInt를 해줘야함
//		String s = 
//		StringBuffer s2 = new StringBuffer();
//		for(int i =0; i<s.length(); i++) {
//			char ch = s.charAt(i); // 자바에서는 character도 정수
//			if(ch>'0'&&ch<'9') {
//				s2.append(ch);
//			}
//		}
//		int age = br.read(Integer.parseInt(age));
		
		System.out.println(name);
		System.out.println(addr);
//		System.out.println(age);

	}

}
