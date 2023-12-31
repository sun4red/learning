package p2023_07_25;

public class WrapperEx {

	public static void main(String[] args) {

		
		// int형 변수의 최대값과 최소값 구하기
		
		System.out.println("max = "+ Integer.MAX_VALUE);
		System.out.println("min = "+ Integer.MIN_VALUE);
		
		// String형을 int형으로 형변환
		
		int n = Integer.parseInt("20");
		System.out.println(n);
		System.out.println(n*4);
		
		//parseInt()메소드 안에는 숫자로 형변환이 가능한 문자만 사용해야한다.
		
		// 10진수를 2진수로 변환
		System.out.println(Integer.toBinaryString(n));
		
		// 10진수를 8진수로 변환
		System.out.println(Integer.toOctalString(n));
		
		// 10진수를 16진수로 변환
		System.out.println(Integer.toHexString(10));
		
		
	}
	
}
