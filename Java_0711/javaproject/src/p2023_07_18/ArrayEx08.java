package p2023_07_18;

public class ArrayEx08 {
	public static void main(String[] args) {
// 배열 복사!

		int[] oldIntArray = { 10, 20, 30 }; // 원본배열
		int[] newIntArray = new int[5]; // 새로운 배열

		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ",");
		}
		
		System.out.println();
		
		// 향상된 for문
		for (int i : newIntArray) {
			System.out.print(i+"\t");
		}
	}
}
