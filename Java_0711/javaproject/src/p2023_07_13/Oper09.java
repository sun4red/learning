package p2023_07_13;

public class Oper09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*		5. 확장 대입 연산자
	     +=, -=, *=, /=, %=

	     ex)    a+=b;	// a = a + b;
	            a-=b; 	// a = a - b;
	            a*=b; 	// a = a * b;
	            a/=b; 	// a = a / b;
	            a%=b;	// a = a % b;   */
		
		int a = 10, b = 3;
		System.out.println(a+=b);  // a = a + b; 결과값 13
		System.out.println(a-=b);  // a = a - b;
		System.out.println(a*=b);  // a = a * b;
		System.out.println(a/=b);  // a = a / b;
		System.out.println(a%=b);  // a = a % b;
	}

}
