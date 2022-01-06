package day16ch08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ch08exam {
	public static void main(String[] args) { // PPT 8장 28페이지 참고
		BufferedInputStream srcStream = null; // 바이트 단위의 바이너리 데이터를 처리하는 버퍼를 이용한 입출력
		BufferedOutputStream destStream = null;
		File src = new File("a.jpg");
		File dest = new File("b.jpg");
		int c;
		try {
			srcStream = new BufferedInputStream(new FileInputStream(src));
			destStream = new BufferedOutputStream(new FileOutputStream(dest));

			long tenPercent = src.length() / 10;
			long progress = 0; // 파일 크기 10% 될 때까지 읽은 누적 바이트 수

			System.out.println("a.jpg를 b.jpg로 복사합니다. \n10%마다 *를 출력합니다.");

			byte[] buf = new byte[1024];
			int numRead = 0; // 읽은 바이트 수
			while (true) {
				numRead = srcStream.read(buf, 0, buf.length);
				if (numRead == -1) { // 파일 끝에 도달함
					if (progress > 0) { // 지난번에 읽었지만 10%에 도달하지 않아 *가 출력되지 않은 경우
						System.out.print("*");
					}
					break; // 파일 끝에 도달함
				}
				if (numRead > 0)
					destStream.write(buf, 0, numRead);
					// void write(byte[] b, int off, int len) 배열 b[off]부터 len 바이트를 해당 출력 스트림에 저장함.

				progress += numRead; // 파일 크기 10% 될 때까지 읽은 누적 바이트 수
				if (progress >= tenPercent) { // 10% 만큼 읽었다면
					System.out.print("*");
					progress = 0; // * 출력하고 progress를 0으로 리셋
				}
			}
			srcStream.close();
			destStream.close();
		} catch (IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
	}

	public static void main06(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileInputStream srcStream = null;
		FileInputStream destStream = null;

		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");

		System.out.print("첫번째 파일 이름을 입력하세요>>");
		String src = scanner.nextLine();

		System.out.print("두번째 파일 이름을 입력하세요>>");
		String dst = scanner.nextLine();

		System.out.println(src + "와 " + dst + "를 비교합니다.");
		try {
			srcStream = new FileInputStream(src); // 버퍼 입력 스트림에 연결
			destStream = new FileInputStream(dst); // 버퍼 출력 스트림에 연결
			if (compareFile(srcStream, destStream))
				System.out.println("파일이 같습니다.");
			else
				System.out.println("파일이 다릅니다.");

			if (srcStream != null)
				srcStream.close();
			if (destStream != null)
				destStream.close();
		} catch (IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}

		scanner.close();
	}

	private static boolean compareFile(FileInputStream src, FileInputStream dest) throws IOException {
		byte[] srcBuf = new byte[1024]; // 1KB 버퍼
		byte[] destbuf = new byte[1024]; // 1KB 버퍼

		int srcCount = 0, destCount;
		while (true) {
			srcCount = src.read(srcBuf, 0, srcBuf.length); // src 스트림에서 srcBuf 크기만큼 읽기
			// int read(byte[] b, int off, int len) 해당 입력 스트림으로부터 len 바이트를 읽어들인 후, 배열
			// b[off]부터 저장함.
			destCount = dest.read(destbuf, 0, destbuf.length); // dest 스트림에서 destBuf 크기만큼 읽기
			if (srcCount != destCount) // 읽어들인 바이트 수가 다르면 파일이 다름
				return false;

			if (srcCount == -1)
				break; // 파일 끝에 도달함

			for (int i = 0; i < srcCount; i++) {
				if (srcBuf[i] != destbuf[i]) // 읽은 바이트들 비교
					return false;
			}
		}
		return true;
	}
}