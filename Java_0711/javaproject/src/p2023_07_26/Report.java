package p2023_07_26;

public class Report {

	public static void main(String[] args) {

		int r6[] = new int[6];

		for (int r = 0; r < 6; r++) {
			r6[r] = (int) (Math.random() * 45 + 1);
			if (r > 0) {
				for (int c = 0; c < r; c++) {
					if (r6[c] == r6[r]) {
						r--;
					}
				}
			}
		}
		for (int p = 0; p < 6; p++) {
			System.out.println("번호" + (p + 1) + " : " + r6[p]);
		}
	}
}
