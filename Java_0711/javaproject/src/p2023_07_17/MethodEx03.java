package p2023_07_17;

import java.util.Scanner;

public class MethodEx03 {

	// 키보드로 입력한 2개의 정수 중에서 최대값과 최소값을 구하는 프로그램을 작성
	// 단, 메소드를 이용해서 작성하세요.

	// 최대값을 구하는 메소드

	static int max(int a, int b) { // static 은 정적메소드 나중에는 특별할때만 사용
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	static int min(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}

	// 최소값을 구하는 메소드

	public static void main(String[] args) {

		int n1, n2, max, min;
		System.out.println("정수 2개를 입력하세요");
		Scanner sc = new Scanner(System.in);

		n1 = sc.nextInt();
		n2 = sc.nextInt();

		max = max(n1, n2);		// 메소드명 앞에 클래스 명을 붙여주는게 원칙
		min = min(n1, n2);
		
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		

	}
}
