package p2023_07_18;

public class Report02 {
	public static void main(String[] args) {

		int[][] score = { { 85, 60, 70 }, { 90, 95, 80 }, { 75, 80, 100 }, { 80, 70, 95 }, { 100, 65, 80 } };

		String name1[] = { "국어", "영어", "수학" };
		String name2[] = { "학생1", "학생2", "학생3", "학생4", "학생5" };

		int subject[] = new int[3];
		int student[] = new int[5];

		int r, c;
		for (c = 0; c < 3; c++) {
			for (r = 0; r < 5; r++) {
				subject[c] += score[r][c];
			}
			System.out.println(name1[c] + " 점수 합: " + subject[c]);
		}
		
		for (r = 0; r < 5; r++) {
			for (c = 0; c < 3; c++) {
				student[r] += score[r][c];
			}
			System.out.println(name2[r] + " 점수 합 : " + student[r]);

		}
	}
}
