package p2023_07_25;

import java.util.Scanner;

public class Report {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("주민번호를 입력하세요");
		System.out.println("ex : 900101-1234567");
		try {
			String j = sc.nextLine();

			String j1 = j.substring(0, 6);
			String j2 = j.substring(7, 14);
			String j12 = j1 + j2;

			String eachj1[] = new String[13];
			int eachj2[] = new int[13];

			for (int i = 0; i < 13; i++) {
				eachj1[i] = j12.substring(i, i + 1);
				eachj2[i] = Integer.parseInt(eachj1[i]);
			}

			int k = 2;
			int jk = 0;
			for (int i = 0; i < 12; i++) {
				jk += eachj2[i] * k;
				k++;
				if (k == 10) {
					k = 2;
				}
			}

			int checknum = 11 - (jk % 11);

			if (checknum >= 10) {
				checknum = checknum % 10;
			}
			if (checknum != eachj2[12]) {
				System.out.println("잘못된 주민번호");

			} else {
				System.out.println("정상");
			}

		} catch (Exception e) {
			System.out.println("주민번호 오기입");
		}
	}

}
