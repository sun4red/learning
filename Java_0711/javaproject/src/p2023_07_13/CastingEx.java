package p2023_07_13;

public class CastingEx {
	public static void main(String[] args) {
	
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		// 왜이럼
		

		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}
}
