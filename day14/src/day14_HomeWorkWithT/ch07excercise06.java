package day14_HomeWorkWithT;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class ch07excercise06 {
	private HashMap<String, Location> locMap = new HashMap<String, Location>();
	{
		locMap.put("서울", new Location("서울",37,126));
		locMap.put("LA", new Location("LA",34,-118));
		locMap.put("파리", new Location("파리",2,48));
		locMap.put("시드니", new Location("시드니",151,-33));
	}
	private Scanner sc;
	public static final int MAX = 4;
	// 생성자
	public ch07excercise06() {
//		input();
//		System.out.println(locMap);
		list();
		while(true) {
			Location loc = search();
			if(loc !=null && "그만".equals(loc.getCity())) break; // 종료방법 02
			System.out.println(loc == null ? "도시가 없습니다." :loc);
		}
		System.out.println("프로그램을 종료합니다!");
	}
	private void list() {
		Set<String> keys = locMap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String city = it.next();
			System.out.println(locMap.get(city));
		}
	}
	private Location search() {
		if(sc==null) sc = new Scanner(System.in);
		System.out.print("도시 이름 >> ");
		String city = sc.next();
		
		if("그만".equals(city)) {
			// 종료방법 01
//			System.out.println("프로그램을 종료합니다!");
//			System.exit(0);
			// 종료방법 02
			return new Location("그만", 0, 0);
		}
		return locMap.get(city);
	}
	private void input() {
		if(sc==null) sc = new Scanner(System.in);
		System.out.println("4개 도시의 도시, 위도, 경도를 입력하세요.");
		for(int i =0; i<MAX; i++) {
			System.out.print(">> ");
			String value = sc.nextLine();
			StringTokenizer st = new StringTokenizer(value, ", ");
			String city = st.nextToken();				// 도시
			int lat = Integer.parseInt(st.nextToken()); // 경도
			int lon = Integer.parseInt(st.nextToken()); // 위도
			Location loc = new Location(city, lat,lon);
			locMap.put(city, loc);
		}
		System.out.println();
		sc.close();
	}
	
	public static void main(String[] args) {
		new ch07excercise06();
	}
}