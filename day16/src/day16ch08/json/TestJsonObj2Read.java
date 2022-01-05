package day16ch08.json;

import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;

public class TestJsonObj2Read {
	public TestJsonObj2Read() {
		InputStream is = this.getClass().getResourceAsStream("members.json");
		JSONTokener tk = new JSONTokener(is);
		JSONObject jObj = new JSONObject(tk);
		
		System.out.println(jObj.toString(2));
	}
	public static void main(String[] args){
		new TestJsonObj2Read();
	}

}
