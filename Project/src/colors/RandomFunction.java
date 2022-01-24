package colors;

import java.util.Random;

public class RandomFunction{
	private static final int RED = 1;
	private static final int BLUE = 2;
	private static final int GREEN = 3;

    public static void main(String args[]) {
        int a;
        Random r = new Random(); //객체생성
 
        System.out.print("랜덤으로 뽑힌 숫자는 5개의 숫자는 : ");
        for(int i=1;i<=5;i++) //5개의 숫자를 출력하기 위하여 for문을 사용하여 5번 반복실행
        {
            a = r.nextInt(10);
            /*nextInt(10)은 0~9까지 숫자중 랜덤함수 발생이므로 +11을 더해줘서 11~100까지의
             숫자중 하나를 뽑아 변수 a에 값을 저장한다 */
            
            if(i==5) { //마지막 5번째 출력값에 ,를 제외하기 위한 조건문
                System.out.print(a);
            }
            else {
                System.out.print(a+",");
            }
        }
        System.out.print("입니다.");
    }
}
