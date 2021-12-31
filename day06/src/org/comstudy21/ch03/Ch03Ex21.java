package org.comstudy21.ch03;

public class Ch03Ex21 {

	public static void main(String[] args) {
		int[] arr ={10,30,40,90,120,50};
		
		for(int number : arr) { //  number에 int[] arr = {} 안의 넣어짐
			System.out.println("number => " +number);
		}
		System.out.println("-------------------");
		for(int i =0; i<arr.length; i++) {
			int number =arr[i];
			System.out.println("number => "+number);
		}
	}

}
