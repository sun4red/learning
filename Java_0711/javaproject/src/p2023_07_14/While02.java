package p2023_07_14;

public class While02 {
	public static void main(String[] args) {

		// while문을 이용해서 1~100까지 홀수, 짝수의 합을 구하는 프로그램
		// 단, while문 1개와 if~else문으로 작성하세요

		int n = 1, odd = 0, even = 0;

		while (n <= 100) {
			if (n % 2 == 1) {
				odd += n;
			} else {
				even += n;
			}
			n++;
		}
		System.out.println("홀수 : " + odd + " 짝수 : " + even);
	}

}
