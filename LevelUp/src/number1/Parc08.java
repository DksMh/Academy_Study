package number1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Parc08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> m = new HashMap<String,Integer>();
		while(true) {
			System.out.println("이름과 포인트 입력 >> ");
			String name = sc.next();
			if("그만".equals(name)) {
				break;
			}
			int num = sc.nextInt();
			if(m.get(name)== null) {
				m.put(name, num);
			}else {
				m.put(name, m.get(name)+num);
			} // 넣어주기 
			// 콘솔에 보여주기
			Set<String> key = m.keySet();
			Iterator<String> it = key.iterator();
			while(it.hasNext()) {
				name = it.next();
				num = m.get(name);
				System.out.println("("+name+","+num+")");
			}
		}
		sc.close();
	}
}
