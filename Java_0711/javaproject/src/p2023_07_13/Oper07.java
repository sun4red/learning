package p2023_07_13;

import java.util.Scanner;

public class Oper07 {
	public static void main(String[] args) {

		// 논리 연산자 : ||, &&, !

		int n1, n2, n3, n4, n5, total;
		double avg;

		System.out.println("5과목 점수 순서대로 입력");

		Scanner sc = new Scanner(System.in);

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		total = n1 + n2 + n3 + n4 + n5; // 총점

		// 1. int형과 int형을 산술연산을 수행하면 결과는 int형으로 처리된다.
		// 2. int형과 double형을 산술연산을 수행하면 큰 자료형인 double형으로 처리된다.

		avg = (double) total / 5; // 평균
		System.out.println("avg : " + avg);

		if (n1 >= 40 && n2 >= 40 && n3 >= 40 && n4 >= 40 && n5 >= 40 && avg >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		/*
		 * if (chap1 < 40 | chap2 < 40 | chap3 < 40 | chap4 < chap | 5) {
		 * System.out.println("과락점수 발생"); if (((chap1 + chap2 + chap3 + chap4 + chap5) /
		 * 5) >= 60) { System.out.println("평균점수 : " + (chap1 + chap2 + chap3 + chap4 +
		 * chap5) / 5); }
		 */
	}

}
