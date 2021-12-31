package HomeWorkWithT_ex05;

public class PositivePoint extends Point {
	public PositivePoint() {
		this(0,0);
	}
	public PositivePoint(int x, int y) {
		super(x, y); // 생성자 위에는 아무 것도 올 수 없다.
		if(x<0 || y<0) {
			super.move(0,0);
		}
	}
	
	@Override
	protected void move(int x, int y) {
		if(x>=0 && y>=0) {
			super.move(x, y);
		}
	}
	public static void main(String[] args) {
		
	}

}
