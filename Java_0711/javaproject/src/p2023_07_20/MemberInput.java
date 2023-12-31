package p2023_07_20;

import java.util.Scanner;

public class MemberInput {

	public static void main(String[] args) {

		System.out.println("회원정보를 입력하세요");
		System.out.println("성명, 나이, 이메일, 주소");

		Scanner sc = new Scanner(System.in);

		String i1 = sc.next();
		int i2 = sc.nextInt();
		String i3 = sc.next();
		String i4 = sc.next();

		MemberInfo m1 = new MemberInfo(i1, i2, i3, i4);

		System.out.println("회원정보");
		System.out.println("성명\t:" + m1.getName());
		System.out.println("나이\t:" + m1.getAge());
		System.out.println("이메일\t:" + m1.getEmail());
		System.out.println("주소\t:" + m1.getAddress());

	}

}

class MemberInfo {
	private String name;
	private int age;
	private String email;
	private String address;

	public MemberInfo(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
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
