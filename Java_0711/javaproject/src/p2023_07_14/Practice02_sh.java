package p2023_07_14;

public class Practice02_sh {
	public static void main(String[] args) {
		// 과제 02
		// 구구단 (2~9단)을 열방향 (세로방향)으로 출력하는 프로그램 작성

		for (int d = 2; d <= 9; d++) {
			System.out.print("[" + d + "단]\t");
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int d = 2; d <= 9; d++) {
				System.out.print(d + "*" + i + "=" + d * i + "\t");
			}
			System.out.println();
		}
	}
}