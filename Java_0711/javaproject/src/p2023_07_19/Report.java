package p2023_07_19;

public class Report {
// 구구단 2차원 배열

	public static void main(String[] args) {

		int guGu[][] = new int[9][8];

		for (int r = 0; r <= 7; r++) {
			for (int c = 0; c <= 8; c++) {
				guGu[c][r] = (c + 1) * (r + 2);
				System.out.print(guGu[c][r] + "\t");
			}
			System.out.println();
		}
	}
}
