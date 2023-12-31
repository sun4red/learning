package p2023_07_18;

public class ArrayEx05 {
	public static void main(String[] args) {
		int[] scores; // 새로운 공간을 할당받지 못한 상태
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);

		int sum2 = add(new int[] { 83, 90, 87 }); // add 메소드 호출
		System.out.println("총합 : " + sum2);
		System.out.println();

	}
	// 참조형 Call by Reference 방식 주소값을 전달한다!
	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
