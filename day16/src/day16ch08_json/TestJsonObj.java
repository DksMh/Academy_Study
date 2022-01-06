package day16ch08_json;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestJsonObj {

	public static void main(String[] args) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("no", 1); // map이랑 비슷하다
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
		
//		System.out.println(jsonObj.toString(1));
		System.out.println(jArr.toString(1));
	}

}
