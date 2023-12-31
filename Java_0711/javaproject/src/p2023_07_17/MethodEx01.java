package p2023_07_17;

public class MethodEx01 {

	// 메소드 : 여러가지 코드를 묶어놓은 것
	// 메소드를 사용하는 이유는 코드를 재사용하기 위함이다.

	// 사용자 정의 메소드 (메인메소드 바깥에 작성해야함)
	// 사용자 정의 메소드는 가상머신이 호출해주지않음, 직접 호출해야함
	// 그냥 두면 아무것도 호출되지않음

	public static void check() { // 정적 메소드(static이 붙음)
		System.out.println("메소드 호출 성공");
		return; // return 생략 가능
		// 자바의 경우 사용자 메소드의 위치가 크게 상관이 없다.
		// 다른 언어의 경우 에러가 발생할 수 있음.
	}

	// Call by Value방식 (값 전달에 의한 메소드 호출방식)
	static void check(int a) { // 괄호 안의 변수를 매개변수(parameter)라고함
		System.out.println("전달된 값:" + a);
		// 매개변수가 기본자료형일 경우 값을 전달
		// 매개변수는 메소드 괄호안에서만 사용되는 변수! 이것도 지역변수에 해당(스택영역에 저장)

	}

	static void check(int a, double d) {
		double result = a + d;
		System.out.println("전달될 값의 합:" + result);

		// 한 클래스 내에 다른 매개변수, 서로다른 메소드로 인식, 메소드 오버로딩
		// void를 썼기 때문에 return 생략 가능, 값을 출력하지 않아도 됨
	}

	static void check(char c) { // char c = "A"
		System.out.println("전달된 값:" + c);
	}

	static void check(boolean b) {
		System.out.println("전달된 값:" + b);
	}

	static void check(String s) {
		// (Call by Reference 방식) 참조형
		System.out.println("전달된 값:" + s);
	}

	// return문 : 메소드를 호출한 곳에 값을 돌려주는 역할
	static int check01() {
		// void 대신 자료형 int가 왔기 때문에 return값을 반드시 입력해주어야함
		System.out.println("리턴구문");
		return 50; // 마지막 줄에 있어야함
		// 메소드 호출한 곳에 50을 돌려주는 역할
	}

	static double check02(int a, double d) {
		double result = a + d; 	// a+d라는 값을 result 값에 저장했다가
		return result;			// result 값을 돌려준다.
	}

	// main()메소드는 자바가상머신(JVM:java.exe)으로만 호출된다.
	// main()메소드는 프로그래머가 직접 호출 할 수 없다.
	public static void main(String[] args) {
		MethodEx01.check(); // check()메소드 호출
		check(); // 같은 클래스 내에 있는 정적메소드는 클래스명을 생략할 수 있음

		check(30);
		check();

		check(2, 5.2);
		check('A');
		check(true);
		check("자바"); // 기본자료형이 아니기 때문에 "자바"의 주소값을 전달한다.
		check(new String("바자"));

		check01(); // return문으로 돌려주는 값이 출력되지않는다.
		int result = check01();
		System.out.println("돌려받은 값1:" + result);
		System.out.println("돌려받은 값2:" + check01());
		
		double result2 = check02(50,3.14);
		System.out.println("돌려받을 값3:"+result2);
		System.out.println("돌려받을 값4:"+check02(50,3.14));
		}

	// main메소드가 가장 먼저 호출되고 main안에 있는 메소드가 실행됨

}
