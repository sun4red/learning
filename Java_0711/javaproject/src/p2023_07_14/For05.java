package p2023_07_14;

import java.util.Scanner;

public class For05 {
	public static void main(String[] args) {

		// 구구단을 외자

		System.out.println("원하는 단을 입력하세요");
		Scanner sc = new Scanner(System.in);

		int dan = sc.nextInt();
		System.out.println("[" + dan + "단]");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}
}
