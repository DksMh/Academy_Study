package test03;

import java.util.Scanner;
import java.util.Vector;

// 스캐너로 -1 로 넣을 때까지 --> While 안 if
// Vector 사용
// 가장 큰 수 찾으면 나와라

public class ch07_01번 {
	public static void main(String[] args) {
		Vector<Integer> num = new Vector();
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(-1이 입력될 때까지) >>");
		while(true) {
			int n = sc.nextInt();
			if(n == -1) break;
			num.add(n);
		}
		int MAX = 0;
		for(int i = 0; i<num.size(); i++) {
			int qlry = num.get(i);
			if(MAX > qlry) {}// MAX는 그냥 고대로니까 그냥 두기
			else {
				MAX = qlry; // max가 작으니까 비교를 넣어준다.
			}
		}// for문이 끝나는 자리
		System.out.print("가장 큰 수는?? " + MAX);
	}
}
