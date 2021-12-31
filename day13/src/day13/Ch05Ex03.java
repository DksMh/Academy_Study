package day13;

import java.util.ArrayList;
import java.util.Arrays;

class Point01 {
	int x, y;

	public Point01(int i, int j) {
		x = i;
		y = j;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Point01) {
			Point01 p = (Point01) obj;
			if (p.x == this.x && p.y == this.y) {
				return true;
			}
		}
		return false;
	} // end of equals

	@Override
	public String toString() {
//	      return String.format("Point01(%d, %d)", x, y);
		return String.format("(%d, %d)", x, y);
	}

}

public class Ch05Ex03 {
	public static void main(String[] args) {
		ArrayList<Point01> pList = new ArrayList<Point01>(); // 배열 같은 구조 index(순서)
		pList.add(new Point01(2,3));
		pList.add(new Point01(4,5));
		pList.add(new Point01(6,7));
		pList.add(new Point01(8,9));
		pList.add(new Point01(1,2));
		
		System.out.println(pList);
		System.out.println(pList.get(1));
		pList.set(1, new Point01(100,200));
		System.out.println(pList.get(1));
		System.out.println(pList);
		System.out.println("size => "+ pList.size());
		
		// 컬렉션의 결과를 배열로 쉽게 변경할 수 있다.
//		Point01[] arr = new Point01[pList.size()];
//		pList.toArray(arr);
//		System.out.println(Arrays.toString(arr));
		
//		indexOf() <--- 같은 요소가 있다면 index 반환 아니면 -1반환
		// ArrayList에서 객체의 위치를 찾기 위해서는 equals()를 재정의 해야한다.
		// 다른 컬렉션에서도 검색이 가능하려면 hashcode도 재정의 해야한다.		System.out.println(pList.indexOf(new Point01(8, 9)));
		System.out.println(pList.contains(new Point01(40,5)));
	}
	public static void test(String[] args) {
	      Point a = new Point(2, 3);
	      Point b = new Point(2, 3);
	      Point c = new Point(3, 4);
	      
	      System.out.println(a == b); // false <-- 인스턴스의 참조값 비교
	      System.out.println(a.equals(b)); // true
	      System.out.println(a.equals(c)); // false
	   }

	
}
