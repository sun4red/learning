package p2023_07_14;

public class While04 {
	public static void main(String[] args) {

		// while문을 이용해서 구구단(2~9단)을 출력하는 프로그램 작성

		int d = 2;

		while (d <= 9) {
			int i = 1; // i를 다시 1로 초기화 시켜줘야하기 때문에 while문 안쪽에서 초기화
			System.out.println(d + "단 시작");
			while (i <= 9) {
				System.out.println(d + " * " + i + " = " + d * i);
				i++;
			}
			d++;
			System.out.println();
		}
	}
}
