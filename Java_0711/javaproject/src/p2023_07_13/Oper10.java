package p2023_07_13;

public class Oper10 {
	public static void main(String[] args) {

		/*
		 * 증감 연산자 ++ 1씩 증가 ++a (선행 처리) a = a + 1; a++ (후행 처리) a = a + 1;
		 * 
		 * -- 1씩 감소 -aa
		 * 
		 */
		

		int a = 10, b = 10, c = 10, d = 10;
		int a1, b1, c1, d1;

		a1 = ++a;
		b1 = b++;   // b1 = b 를 먼저 처리 한 후 b 값에 +1
		c1 = --c;
		d1 = d--;	// 선행을 하던 후행을 하던 변수 자기자신은 증감이 일어난다.

		System.out.println("a1=" + a1 + " a=" + a);
		System.out.println("b1=" + b1 + " b=" + b);
		System.out.println("c1=" + c1 + " c=" + c);
		System.out.println("d1=" + d1 + " d=" + d);

		c1 = --c;
		System.out.println("c1=" + c1 + " c=" + c);
	}
}
