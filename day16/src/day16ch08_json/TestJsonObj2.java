package day16ch08_json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestJsonObj2 {

	public static void main(String[] args) throws IOException {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("no", 1); 
		jsonObj.put("name", "hong");
		jsonObj.put("email", "hong@h.com"); 
		
		JSONObject jsonObj2 = new JSONObject();
		jsonObj2.put("no", 2); 
		jsonObj2.put("name", "kim"); 
		jsonObj2.put("email", "kim@h.com");
		JSONObject jsonObj3 = new JSONObject();
		jsonObj3.put("no", 3); 
		jsonObj3.put("name", "park"); 
		jsonObj3.put("email", "park@h.com"); 
		
		JSONArray jArr = new JSONArray();
		jArr.put(jsonObj);
		jArr.put(jsonObj2);
		jArr.put(jsonObj3);
		
		// System.out.println(jArr.toString(1));
		
		// 만들어진 JSONObject 데이터를 파일에 기록하기
		// {"aa" : "[{},{},{}]"} 로 만들기
		JSONObject rootObj = new JSONObject();
		rootObj.put("members",jArr);
		
		// 파일에 기록
		// RealPath에 저장
		FileWriter writer = new FileWriter("E:\\java_work\\day16\\src\\day16ch08_json\\members.json");
		writer.write(rootObj.toString(2));
		writer.close();
		
	}

}
