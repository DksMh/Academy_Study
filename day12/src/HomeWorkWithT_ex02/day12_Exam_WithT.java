package HomeWorkWithT_ex02;

import java.util.Scanner;

// 02
class TV{
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() {return size;}
}
class ColorTV extends TV{
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.setColor(color);
	}

	public void printProperty() {
		System.out.println(getSize() +"인치, "+ getColor()+"컬러"); 
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
}
class IPTV extends ColorTV{
	private String adr;
	public IPTV(String adr, int size, int color) {
		super(size, color);
		this.adr = adr;
	}
	public void printProperty() {
		System.out.printf("나의 IPTV는 %s 주소의 ",adr); 
		super.printProperty(); // -> 나와 다른 방법 
	}
	
}
public class day12_Exam_WithT {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
	}
}
