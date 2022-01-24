package org.comstudy21.ch03;

import java.util.Arrays;
import java.util.jar.Attributes.Name;

public class Ch03Ex22 {

	public static void main00(String[] args) {
		String[] names = {"오징어","꼴뚜기", "대구","명태", "거북이"};
		// 4바이트 참조변수, 선언과 동시에 초기화
		int[] price = {9000, 3000, 5000, 6000, 200000};
		
		for(int i =0; i<names.length; i++) {
			System.out.printf("%s의 가격은 %d원입니다.\n", names[i],price[i]);
		}

		//스택			힙
		//[] names --->[오징어] [꼴뚜기] [대구] [명태] [거북이] 
		//				[0]		[1]		[2]		[3]		[4]
		//[] price --->[9000] [3000] [5000] [6000] [200000] 
	
	}
	
	public static void main01(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		// 순서대로 출력
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		// Arrays를 이용해서 순서대로 출력하기
		System.out.println(Arrays.toString(arr));
		
		// 반복문을 이용하여 array배열의 요소값의 위치를 reverse한다.
		// [50, 40, 30, 20, 10]
		// 선생님이랑 한 거
		for(int i =0, end = arr.length-1; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[end-i]; // 4-i = end-i
			arr[end-i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
		// 나혼자 한 거 --> {10,20,30,40,50}에서만 먹힘 
		int a = arr[0];
		int b = arr[1];
		for(int i=0; i<arr.length/2; i++) { // arr.length/2 => 5/2 =2
			arr[0] = arr[4];
			arr[1] = arr[3];
			System.out.print(arr[i]+" ");
		}
		for(int i=2; i<arr.length; i++) { 
			arr[4] = a;
			arr[3] = b;
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void reverse(int[] arr) {
			
		// 반복문을 이용하여 array배열의 요소값의 위치를 reverse한다.
		// [50, 40, 30, 20, 10]
		// 선생님이랑 한 거
		for(int i =0, end = arr.length-1; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[end-i]; // 4-i = end-i
			arr[end-i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main_reverseTest(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println(Arrays.toString(arr));
		reverse(arr); // 콜바이레퍼런스(Call by reference) --> 참조가 옴 실제는 힙에 있고 가져온거 
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main02(String[] args) {
		int[] arr = {7,3,2,8,1,6,9,4,5};
		// 오름차순 정렬해서 출력하시오 (선택정렬)
		
		// 공부 : 삽입정렬, 버블정렬을 공부
		// 삽입정렬 : 1개 1개 비교해서 제일 큰 하나을 앞으로 보내는 거
		// [1,2,3,4,5,6,7,8,9]
		
		// 선생님 방법
		for(int i=0; i<arr.length-1; i++) {// 7,3,2,8,1,6,9,4까지 돔
			for(int j=i+1; j<arr.length; j++) { // 전체 돔
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;			
				}
			}
		}
		System.out.print(Arrays.toString(arr));
		
		// 혼자 한 방법
//		for(int i=0; i<arr.length; i++) { 
//			for(int j=i+1; j<arr.length; j++) { // a[i] = a[0] 일때, a[j = i+1] = a[1]
//				if(arr[i]>arr[j]) { 
//					int temp = arr[i]; 
//					arr[i] = arr[j]; 
//					arr[j] = temp;
//				}		
//			}
//			System.out.print(arr[i]+" ");
//		}
	}
	
	public static void main(String[] args) {
		// A))
//		final int SIZE = 6;
//		int[] lotto = new int[SIZE];
//		// 번호 만들기
//		for(int i=0; i<SIZE; i++) {
//			lotto[i] = (int)(1+Math.random() * 45);
//         // 중복 번호 제거
//		for(int j=0; j<i; j++) {
//			if(lotto[i] == lotto[j]) {
//				i--;
//				break;
//				}
//			}
//		}		
		
//		// 선생님과 함께 A))
//		final int SIZE = 6;
//		int[] lotto = new int[SIZE];
//		for(int i=0; i<SIZE; i++) {
//			int num = (int)(1+Math.random()*6);
//			// 새로 생성한 num의 값과 lotto 배열에 저장된 요소를 비교한다.
//			// 이부분부터 반복 ---> num과 같은 값이 이미 있다면 새로 다시 num을 생성한다.
//			// 새로 다시 생성한 num과 lotto의 요소를 비교한다. (계속 반복)
//			for(int j=0; j<i; j++) {
//				if(num == lotto[j]) {
//					num = (int)(1+Math.random()*6); // 같은 거 있음 새로 뽑아라
//					j = -1; 
//				}
//			}
//			lotto[i] = num;
//		}
		// 로또번호가 중복 없이 나오도록 개선하시오.
//		System.out.println(Arrays.toString(lotto));
		
		
		// 선생님과 함께 B))
//		final int SIZE = 6;
//		int[] lotto = new int[SIZE];
//		
//		int cnt = 0;
//		while(cnt<6) {
//			lotto[cnt] = (int)(1+Math.random()*6);
//			boolean flag = true;
//			for(int i=0; i<cnt; i++) {
//				if(lotto[cnt] == lotto[i]) { 
//					flag = false;
//					break;
//				}
//			}
//			if(flag) cnt++;
//		}
//		Arrays.sort(lotto);
//		System.out.println(Arrays.toString(lotto));
		
		// 선생님과 함께 C))
		final int MAX = 6;
		int[] lotto = new int[MAX]; // => size
		int[] balls = new int[45]; // -> 우리한테 공은 3개
		for(int i=1; i<=45; i++) {
			balls[i-1] = i;
		}
		System.out.println("1~45까지의 공이 준비되었다.");
		// 1. balls 배열의 index를 랜덤하게 선택한다.
		// 2. 그 index 위치의 번호가 0이 아니면 lotto 배열에 추가한다.
		// 3. 뽑아온 index 위치의 값을 0으로 변경
		// 4. index 위치의 값이 0이면 다른 랜덤한 index 선택. (끝까지 반복)
		for(int i=0; i<lotto.length; ) {
			int index = (int)(Math.random()*45); // 0~44까지의 난수 발생
			if(balls[index] != 0) {
				lotto[i] = balls[index];
				balls[index] = 0;
				i++;
			}
		}
		
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
}
