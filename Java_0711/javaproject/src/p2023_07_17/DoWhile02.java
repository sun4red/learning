package p2023_07_17;

public class DoWhile02 {
	public static void main(String[] args) {
		// do ~ while문으로 1~100 까지 홀수, 짝수의 합을 구하는 프로그램

		int i = 1, odd = 0, even = 0;

		do {
			if (i % 2 == 1) {
				odd += i;
			} else {
				even += i;
			}
			i++;

		} while (i <= 100);
		System.out.println("홀수 합 : " + odd);
		System.out.println("짝수 합 : " + even);
	}
}
