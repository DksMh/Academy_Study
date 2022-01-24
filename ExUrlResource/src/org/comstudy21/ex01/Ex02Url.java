package org.comstudy21.ex01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex02Url {

	public Ex02Url() throws IOException {
		String imgUrlPath = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjAxMDVfMTMw%2FMDAxNjQxMzQ0NDg1NDc1.FpQ10h9q5-ANFo74Ceisj9GKWxrATyFGdU5dIu21u4gg.O1qSTnugGXsM36xOhW2KWb9am517Dgt_c5ck6v-ekKgg.JPEG.nzmouse%2F20220105%25A3%25DF091916.jpg&type=sc960_832";
		URL url = new URL(imgUrlPath);
		
		InputStream is = url.openStream();
		DataInputStream dis = new DataInputStream(is);
		
		File dir = new File("./images");
		if(!dir.exists()) {
			if(dir.mkdir()) {
			//디렉토리 생성 권한이 없다면 만들어지지 않는다.
			System.out.println("새 디렉토리 생성 완료!");
			}
		}
		
		String saveFilePath = "photo.jpg";
		File file = new File(dir, saveFilePath);
		FileOutputStream fos = new FileOutputStream(file); // -> 아웃풋 스트림을 만들어야한다.
		DataOutputStream dos = new DataOutputStream(fos);
		int data = 0;
		while((data=dis.read())!= -1) {
			// 읽어온 것을 파일로 저장
			dos.write(data);
			
		}
		
		if(dis != null) dis.close();
		if(is != null) is.close();
		if(dos != null) dos.close();
		if(fos !=null)  fos.close();
		
	}
	public static void main(String[] args) throws IOException {
		new Ex02Url();
	}

}
