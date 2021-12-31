package org.comstudy.ch05;

import org.comstudy.ch05_2.AAA;

class BBB extends AAA{
   public void set() {
      // private 멤버는 서브에서도 접근 불가능.
      // privateData = 10; 
	   //deafault 멤버는 다른 패키지에서 접근 불가
//      defaultData = 100; 
      protectedData = 1000; // 상속을 받아 가능
      publicData = 10000;
   }
}
public class Ch05Ex02 {
   public static void main(String[] args) {
      AAA aaa = new AAA();
      
      System.out.println(aaa.toString());
      System.out.println(aaa.equals(null));
      
   }
   
}