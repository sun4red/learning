package p2023_07_21;

import java.util.Scanner;

class MInfo_Re {

	private String name;
	private int age;
	private String email;
	private String address;

	/*
	 * 생성자 금지 public MInfo_Re(String name, int age, String email, String address) {
	 * 
	 * setter 메소드 사용으로 제거 this.name = name; this.age = age; this.email = email;
	 * this.address = address;
	 * 
	 * 
	 * }
	 */

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}
}

public class MInput_Re {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("회원 수를 입력하세요");
		int members = sc.nextInt();
		sc.nextLine();

		MInfo_Re mi[] = new MInfo_Re[members];
		String name[] = new String[members];
		int age[] = new int[members];
		String email[] = new String[members];
		String address[] = new String[members];
		// 입력
		for (int i = 0; i < members; i++) {

			System.out.println((i + 1) + "번 째 회원정보 입력");
			System.out.println("이름");
			name[i] = sc.nextLine();
			System.out.println("나이");
			age[i] = sc.nextInt();
			sc.nextLine();
			System.out.println("이메일");
			email[i] = sc.nextLine();
			System.out.println("주소");
			address[i] = sc.nextLine();
			System.out.println();

		}

		// 객체 생성
		for (int i = 0; i < members; i++) {

			mi[i] = new MInfo_Re();

			mi[i].setName(name[i]);
			mi[i].setAge(age[i]);
			mi[i].setEmail(email[i]);
			mi[i].setAddress(address[i]);

		}

		System.out.println("회원정보 입력완료");
		for (int i = 0; i < members; i++) {
			System.out.println("회원" + (i + 1) + "정보");
			System.out.println("이름\t:" + mi[i].getName());
			System.out.println("나이\t:" + mi[i].getAge());
			System.out.println("이메일\t:" + mi[i].getEmail());
			System.out.println("주소\t:" + mi[i].getAddress());
		}
	}

}
