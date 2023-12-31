package p2023_07_19;

class MyDate06 {
	// field : 객체가 생성될 때 heap 메모리 상에 값을 저장하는 역할

	private int year;
	private int month;
	private int day;

	// 생성자 : 객체가 생성될 때 호출되면서, 필드값을 초기화 시키는 역할

//  public MyDate(){//default 생성자
//  }  
	public MyDate06(int new_year, int new_month, int new_day) {
		year = new_year; // 2023
		month = new_month; // 7
		day = new_day; // 19
	}
	/*
	 * public void SetYear(int year){ // this.year=year; year=year; } public void
	 * SetMonth(int new_month){ month=new_month; // month=8 }
	 */

	// 1. 메소드 : 필드값을 출력하는 역할

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}

	// 2. getters 메소드 : 메소드 호출한 곳에 각각 값을 리턴해주는 역할
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	// 3. setters 메소드 : 필드값을 수정, 변경하는 역할
	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

}

public class ConstructorTest06 {
	public static void main(String[] args) {
		MyDate06 d = new MyDate06(2023, 7, 19);
		d.print();
		d.setYear(2024); // 변경되지 않음 ? 됨
		d.print();
		d.setMonth(10); // 변경됨
		d.print();
		d.setDay(25);
		d.print();

		System.out.println("돌려받은 year:" + d.getYear());
		System.out.println("돌려받은 year:" + d.getMonth());
		System.out.println("돌려받은 year:" + d.getDay());

		// 하나의 클래스 내에 매개변수를 달리하는 여러 생성자 선언, 생성자 오버로딩
		// 매개변수의 타입, 개수, 순서가 다르게 선언되어 구분된다.
	}
}