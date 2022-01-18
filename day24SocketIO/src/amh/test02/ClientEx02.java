package amh.test02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx02 {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in); // 키보드에서 읽을 scanner 객체 생성

		try {
//			socket = new Socket("localhost", 9999); // 클라이언트 소켓 생성. 서버에 연결
			socket = new Socket(InetAddress.getLocalHost(), 9999);  
			// InetAddress 클래스 : 자바에서 IP 주소를 표현할때 사용하는 클래스
			// getLocalHost() 메서드 : 로컬 호스트의 InetAddress객체를 반환한다.
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				System.out.print("보내기>>"); // 프롬프트
				String outputMessage = sc.nextLine(); // 키보드에서 한 행 읽기
				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + "\n"); // "bye" 문자열 전송
					out.flush();
					break; // 사용자가 "bye"를 입력한 경우 서버로 전송 후 실행 종료
				}
				out.write(outputMessage + "\n"); // 키보드에서 읽은 문자열 전송
				out.flush(); // out의 스트림 버퍼에 있는 모든 문자열 전송
				String inputMessage = in.readLine(); // 서버로부터 한 행 수신
				System.out.println("서버: " + inputMessage);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage()); // e.getMessage() : 에러의 원인을 간단하게 출력합니다.
		} finally {
			try {
				sc.close();
				if(socket != null) socket.close(); // 클라이언트 소켓 닫기
			} catch (IOException e) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
