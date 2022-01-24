package colors;

public class test1 {
	public static void main(String[] args) {
		int num[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		int count = 0;
		int i, j;

		// 8개의 랜덤 값 배정
		while (count < 8) {
			i = (int) Math.round(Math.random() * 3);
			j = (int) Math.round(Math.random() * 3);

			if (num[i][j] == 0) {
				num[i][j] = (int) Math.round(Math.random() * 9 + 1);
				count++;
			}
		}

		// 결과 출력
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++)
				System.out.printf("%2d ", num[i][j]);
			System.out.println();
		}
	}
}
