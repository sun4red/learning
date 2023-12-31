package p2023_07_19;

import p2023_07_20.MyDate;

// 2개의 클래스 ㅎㅇ

class MyDate {
	
	// private은 외부에서 접근하는 것을 허용하지 않는다.
	// 접근제어자..!
	
	private int year;		//field, 멤버변수
	private int month;		
	private int day;

	
	// 기본 생성자(Default Constructor) 클래스와 생성자 이름이 같아야한다.
	public MyDate() {
		System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
	
	// 메소드가 올때는 void나 자료형이나 표시해주어야함
		// 한개의 클래스가 독립적으로 실행되기 위해서는 무조건 main 매소드가 필요하다.
	
}// MyDate end

public class ConstructorTest02 {
	public static void main(String[] args) {
		MyDate d = new MyDate();
		d.print();
		
		
		// Private이라 접근을 할 수 없음
//	System.out.println(d.year);
//	System.out.println(d.month);
//	MyDate dd =  new MyDate();
	}
}