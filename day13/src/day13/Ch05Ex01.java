package day13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Ch05Ex01 {

	public static void main(String[] args) {
		String queryStr = "user=hong&msg=hello&job=killer";
		StringTokenizer st = new StringTokenizer(queryStr, "&");
		HashMap<String, String> messageMap = new HashMap<String, String>();
		while(st.hasMoreTokens()) {
			String tk = st.nextToken();
			String[] keyValue = tk.split("=");
//			System.out.println(Arrays.toString(keyValue));
			messageMap.put(keyValue[0], keyValue[1]);
		}
//		System.out.println(messageMap.get("user"));
		
		Iterator<String> it = messageMap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.printf("%s => %s\n", key, messageMap.get(key));
		}
	}

}
