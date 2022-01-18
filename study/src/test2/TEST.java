package test2;
import java.util.Random;


public class TEST {

	public static void main(String[] args) {

		/**
		 * 1. 첫 번쨰 숫자를 입력  51~100까지
		 * 2. 두 번째 숫자를 입력  11~15까지
		 * 3. 랜덤으로 사칙연산 기호 입력
		 * 4. 뽑힌 사칙 연산에 따라 두수를 계산 
		 */
			
		String op1;
		int result=0;
		
		Random rd1 = new Random();
//		int ranNum1 = (rd1.nextInt(50)+51);
		int ranNum1 = (rd1.nextInt(10)+0);
		System.out.println("첫번째 숫자는 " + ranNum1);
		
		Random rd2 = new Random();
//		int ranNum2 = (rd2.nextInt(5)+11);
		int ranNum2 = (rd2.nextInt(10)+0);
		System.out.println("두번째 숫자는 " + ranNum2);
		
		
		String[] op = new String[4];
		op[0] = "+";
		op[1] = "-";
		op[2] = "*";
		op[3] = "/";
		
		Random rd = new Random();
		int ranNum = rd.nextInt(4); 
		
		op1 = op[ranNum];
		
		if(op1.equals("+")) {			
			result = ranNum1 +ranNum2;
		}
		else if(op1.equals("-")) {
			result = ranNum1 - ranNum2;
		}
		else if(op1.equals("*")) {
			op1 = op[2];
			result = ranNum1 * ranNum2;
		}
		else{
			result = ranNum1 / ranNum2;
		}
		
		System.out.println(ranNum1+ op1 + ranNum2 + "= " + result );		
		

	}

}