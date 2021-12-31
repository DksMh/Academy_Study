package HomeWorkWithT_ex03;

import java.util.Scanner;

public abstract class Converter {
    abstract protected double convert(double src); // 추상 메소드
    abstract protected String getSrcString(); // 추상 메소드
    abstract protected String getDestString(); // 추상 메소드
    protected double ratio; // 비율
    
    public void run() { // 서브 클래스에서는 안 만들어줘도 됨
        Scanner sc = new Scanner(System.in);
        System.out.printf( "%s을 %s로 바꿉니다.", getSrcString(), getDestString());
        System.out.printf("%s을 입력하세요>> ", getSrcString());
        double val = sc.nextDouble();
        double res = convert(val);
        System.out.printf("변환 결과: %.2f %s입니다.", res, getDestString());
        sc.close();
    }
}
class Won2Dollar extends Converter{
	private String srcString = "원";
	private String destSting = "달러";
	
	public Won2Dollar(double ratio) {
		super.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return srcString;
	}

	@Override
	protected String getDestString() {
		return destSting;
	}
	
}