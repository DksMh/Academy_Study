package day16ch08_json;

import java.io.FileNotFoundException;
import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;

public class TestJsonObj2Read {
	public TestJsonObj2Read() throws FileNotFoundException {
		InputStream is = this.getClass().getResourceAsStream("members.json");
//		FileInputStream is = new FileInputStream("D://members.json"); // 따로 다른 드라이브에 members.json을 만들었을 경우
		JSONTokener tk = new JSONTokener(is);
		JSONObject jObj = new JSONObject(tk);

		System.out.println(jObj.toString(2));
	}

	public static void main(String[] args) throws FileNotFoundException {
		new TestJsonObj2Read();
	}

}