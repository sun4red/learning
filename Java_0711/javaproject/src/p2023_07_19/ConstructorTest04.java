package p2023_07_19;

// 소스코드는 하나로 되어있지만 컴파일 후 클래스 파일(바이트코드)이 따로 저장이 되기때문에
// 클래스 명을 다르게 해야함
class MyDate04 {
	// 접근자 표시 X (생략) Default 접근자.
	int year;
	int month;
	int day;

	public MyDate04() { // 기본 생성자, 클래스와 동일한 이름으로 작성
		year = 2023;
		month = 4;
		day = 1;
	}

	// this : 내부 레퍼런스 변수, this 붙은쪽이 멤버변수 필드가 되고 없는쪽이 매개변수
	public MyDate04(int year, int month, int day) {
					// 괄호안의 변수명 매개변수
		// this. 붙이면 매개변수의 필드명
		// this. 의 의미 : heap메모리 상에 저장이될 때
		// 묵시적으로 값을 전달해서...?
		
		this.year = year;
		this.month = month;
		this.day = day;
	}  // 주로 많이 사용하는 형식
	// this 생성자와 메소드 안에서 멤버변수와 매개변수 이름이 동일한 경우에 주로 사용함.
	

	/*
	 * public MyDate04(int year, int month, int day) { this.year = year; this.month
	 * = month; this.day = day; }
	 */

	// 이클립스로 새롭게 만들어보자

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}
// MyDate end

public class ConstructorTest04 {
	public static void main(String[] args) {
		MyDate04 d = new MyDate04();
		d.print();		// 기본생성자 호출
		System.out.println(d.year);
		System.out.println(d.month);
		System.out.println(d.day);

		MyDate04 d2 = new MyDate04(2023, 7, 19);
		// d2 의 메모리 주소를 받고..?
		d2.print();
	}
}