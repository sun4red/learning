package p2023_07_13;

import java.util.Scanner;

public class Practice_sh {
	public static void main(String[] args) {

		int n1, n2, n3, max, min;

		System.out.println("정수 값 3개 입력, 최대값과 최소값 출력");

		Scanner sc = new Scanner(System.in);

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		
		max = n1 > n2 ? n1 : n2;
		max = max > n3 ? max : n3;

		min = n1 < n2 ? n1 : n2;
		min = min < n3 ? min : n3;

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}
}
