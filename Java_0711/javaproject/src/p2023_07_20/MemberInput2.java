package p2023_07_20;

import java.util.Scanner;

class MemberInfo2 {

	private String name;
	private int age;
	private String email;
	private String address;

	public MemberInfo2(String name, int age, String email, String address) {
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

public class MemberInput2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("회원 수를 입력하세요");
		int members = sc.nextInt();

		MemberInfo2 mi[] = new MemberInfo2[members];
		String name[] = new String[members];
		int age[] = new int[members];
		String email[] = new String[members];
		String address[] = new String[members];
		// 입력
		for (int i = 0; i < members; i++) {

			System.out.println((i + 1) + "번 째 회원정보 입력");
			System.out.println("이름");
			name[i] = sc.next();
			System.out.println("나이");
			age[i] = sc.nextInt();
			System.out.println("이메일");
			email[i] = sc.next();
			System.out.println("주소");
			address[i] = sc.next();
			System.out.println();
		}
		// 객체 생성
		for (int i = 0; i < members; i++) {

			mi[i] = new MemberInfo2(name[i], age[i], email[i], address[i]);

		}
		System.out.println("회원정보 입력완료");
		for (int i = 0; i < members; i++) {
			System.out.println("회원" + (i+1) + "정보");
			System.out.println("이름\t:" + mi[i].getName());
			System.out.println("나이\t:" + mi[i].getAge());
			System.out.println("이메일\t:" + mi[i].getEmail());
			System.out.println("주소\t:" + mi[i].getAddress());
		}
	}

}
