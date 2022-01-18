package ex02.socketio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientEx01 {
	Socket socket;
	BufferedReader br;
	BufferedWriter bw;
	Scanner scan = new Scanner(System.in);

	public ClientEx01() {
		try {
			// 서버 소켓과 연결 - Socket생성 즉시 서버와 연결 됨.
			socket = new Socket(InetAddress.getLocalHost(), 9998);
			System.out.println("클라이언트 >>> 서버와 연결되었다.");
			// 서버와 입/출력 스트림을 연결한다.
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			// 서버에 userId 보내기
			bw.write("user01" + "\n");
			bw.flush(); // 버퍼를 비워준다.
			// 서버에서 보낸 메시지 받기
			while(true) {
				// 반복해서 읽어들인다.
				String line = scan.nextLine();
				// 서버에 보내주기
				bw.write(line + "\n");
				bw.flush();
				if(".quit".equalsIgnoreCase(line)) {
					System.out.println(".quit가 입력되어 끝낸다!");
					break;
				}
				// 서버에서 날아온 것
				String serverMessage = br.readLine();
				System.out.println(serverMessage);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new ClientEx01();
	}

}