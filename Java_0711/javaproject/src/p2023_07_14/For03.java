package p2023_07_14;

public class For03 {
	public static void main(String[] args) {

		int odd = 0, even = 0;
		
		for (int i = 1; i <= 100; i += 2) {
			odd += i;

		}
		
		for (int j = 2; j <= 100; j += 2) {
			even += j;
		}
		System.out.println(odd + " 그리고 " + even);

	}
}
