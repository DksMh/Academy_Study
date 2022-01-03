package ch07_ex01;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if (iterator.hasNext()) {
				separator = "->";
			} else {
				separator = "\n";
			}
			System.out.print(e + separator);
		}
	}

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");

		Collections.sort(myList); // 요소 정렬 -> 가, 나, 다 순
		printList(myList); // 정렬된 요소 출력

		Collections.reverse(myList); // 요소의 순서를 반대로
		printList(myList); // 요소 출력

		int index = Collections.binarySearch(myList, "아바타") + 1;
		System.out.println("아바타는 " + index + "번째 요소입니다.");

	}
}
// [ hasNext()와 next() 차이 ]
// hasNext()는 boolean 타입으로 반환
// 즉, "True or False"로 반환됩니다. 다음에 가져올 값이 있으면 True, 없으면 False입니다.

// next()는 "매개변수 혹은 iterator되는 타입"으로 반환
// 즉, 아무 타입으로 반환할 수 있다. 
// Iterator에 입력된 값들이 String이면 String 값으로 가져온다.

//(예시)
// 1,2,3,4,5 라는 숫자들이 저장되어 있는 배열을 Iterator 인터페이스로 가지고 올때,
// hasNext()는 "True or False"를 나타내지만
// next()는 "숫자 값"들을 가지고 온다.