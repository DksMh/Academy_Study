package day03;

public class DayEx03 {
	public static void main(String[] args) {
	// 피보나치 수열 누적
		// 1+1-2+3-5+8-13+21=14
		final int MAX = 21;
		int prev = 0;
		int curr = 1;
		int next = 0;
		int sum = 0;
		
		
		// flag알고리즘
		boolean flag = true;
		while(curr<=MAX) {
			System.out.print(curr);
			if (flag) {
				sum = (curr==1)?curr:sum-curr;
				System.out.print("+");
				flag = false; // else로 내려가게
			}else {
				sum += curr;
				System.out.print(curr==MAX?"=":"-");
//				System.out.print("-");
				flag = true; // if로 다시 올라가게
			}
			next = prev+curr;
			prev = curr;
			curr = next;			
		}
		System.out.println(sum);
	}
	
	public static void main06(String[] args) {
		// 피보나치 수열 누적
		// 1+1-2+3-5+8-13+21=14
		final int MAX = 21;
		int prev = 0;
		int curr = 1;
		int next = 0;
		int sum = 0;
		int i = 1; //변수 하나 더 추가 
		
		while(curr<=MAX) {
			System.out.print(curr);
//			System.out.printf("%s", i%2!=0?"+":"-");
//			System.out.printf("(%d)",i); // 부호 확인 // 홀수 일때는 + 짝수일때는 - // 1(1)1(2)2(3)3(4)5(5)8(6)13(7)21(8)
			if(i%2==1) {
//				sum -= curr; // 이렇게 하면 1이 누적이 안되어 다른 값이 나온다 // -2+3-5+8-13+21 = 12 // 1-1=0이 되서
				sum = (i==1)?curr:sum-curr; // 때문에 1이 누적이 될 수 있도록 한다.
				System.out.print("+");
			}else {
				sum += curr;
				System.out.print(curr==MAX?"=":"-");
			}
			
			next = prev+curr;
			prev = curr;
			curr = next;
			
			i = i+1; // i가 하나씩 올라감
		}
		System.out.println(sum);
	}
	public static void main05(String[] args) {
		// 피보나치 수열 누적
		// 1+1-2+3-5+8-13+21=14
		final int MAX = 21;
		final int MIN = 1;
		int prev = 0;
		int curr = 1;
		int next = 0;
		int sum = 0;
		int flag = 1; //변수 하나 더 추가 
		
		for(flag=1; curr <= MAX; flag++) {
			System.out.print(curr); 
			// main02 참조
			if(flag % 2 == 1) {
				sum = curr==MIN ? curr :sum - curr;
				System.out.print("+");
			}else {
				sum += curr;
				System.out.print(curr==MAX?"=":"-");
			}
				next = prev + curr;
				prev = curr;  
				curr = next;
			}			
		System.out.print(sum);
	}
	
	public static void main04(String[] args) {
		// 피보나치 수열 누적
		// 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 = 54
		final int MAX = 21;
		int sum = 0;
		
		// while문을 for문으로 바꾸기
		for(int p = 0,c = 1,n = 0; c<=MAX; n=p+c, p=c, c=n) {
			sum += c;
			System.out.print(c);
			System.out.print(c==MAX?"=":"+");
		}
		System.out.println(sum);
	}
	
	public static void main03(String[] args) {
		// 피보나치 수열 누적
		// 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 = 54
		final int MAX = 21;
		int prev = 0; // 이전항
		int curr = 1; // 현재항
		int next = 0; // 이후항
		int sum = 0;
		
		while(curr <= MAX) { // 현재 수가 21이랑 같아 질 때까지
			//누적하기
			sum += curr; // sum = sum + curr;
			System.out.print(curr);
			System.out.print(curr==MAX?"=":"+"); // 현재 수와 21이 같으면 = 아니면 +
			
			// 다음항이 만들어지면 다음항이 현재항이 되므로 치환 해야한다.
			// 치환해서 증가하기
			// 다음항 = 이전항+현재항
			next = prev+curr;
			// 현재항은 이전항으로 치환
			prev = curr;
			// 다음항은 현재항으로 치환(새로운 현재항)
			curr = next;
		}
		System.out.println(sum);
		
	}
	public static void main02(String[] args) {
		// 1+2-3+4-5+6-7+8-9+10 = 7
		// while문으로 구현하기
		final int MAX = 10;
		final int MIN = 1;
		// 누적하는 변수는 0으로 초기화
		int sum = 0; // 1~10까지 누적
		int num = MIN; // 1~10까지 하나씩 증가
		// 선생님이랑 한 방법
		// 1. 1~10까지 출력 (num을 증가하면서 출력한다)
		while(num<=MAX) {
			System.out.print(num);
			if(num % 2 == 1) { // 홀수는 빼주고 짝수는 더해주기
				sum = num == MIN ? num :sum - num; // 처음 값 1은 빼주면 안돼서 삼항연산자 이용
				System.out.print("+");
			}else {
				sum += num;
				System.out.print(num==MAX?"=":"-");
			}
			num = num + 1;
		}
		System.out.println(sum);
		
		// 혼자 한 방법
//		int num = 1;
//		while (num<=MAX) {
//			if(num % 2 == 0) {
//				sum += num;
//				System.out.print("+"+num);		
//			}else if(num % 2 == 1 && num != 1) {
//				sum -= num;
//				System.out.print("-"+num);
//			}else{
//				sum+=num;
//				System.out.print(num);
//			}
//			num++;
//			
//		}
//		System.out.print("=");
//		System.out.println(sum);
	}
	
	public static void main01(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10 = 55
		// while문으로 구현하기
		final int MAX = 10;
		// 누적하는 변수는 0으로 초기화
		int sum = 0; // 1~10까지 누적
		int num = 1; // 1~10까지 하나씩 증가
		while (num<=MAX) {
			sum += num;
			System.out.print(num);			
			System.out.print(num!=MAX ? "+" : "=");
			num++;
			
		}
		System.out.println(sum);
	}

}
