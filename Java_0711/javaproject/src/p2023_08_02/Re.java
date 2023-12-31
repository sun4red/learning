package p2023_08_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Mi {

	private String name;
	private int age;
	private String email;
	private String address;

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

} // class Mi

public class Re {

	public static void main(String[] args) {

		List<Mi> mi = new ArrayList<Mi>();
		Scanner sc = new Scanner(System.in);

		System.out.println("회원 정보를 입력하세요");

		while (true) {
			System.out.println("입력하시겠습니까? y/n");
			String yn = sc.nextLine();
			int i = 1;
			if (yn.equals("y")) {
				System.out.println(i + "번째 회원 정보");
				System.out.println("이름을 입력하세요");
				String name = sc.nextLine();
				System.out.println("나이를 입력하세요");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("이메일을 입력하세요");
				String email = sc.nextLine();
				System.out.println("주소를 입력하세요");
				String address = sc.nextLine();

				i++;

				Mi cm = new Mi();
				cm.setName(name);
				cm.setAge(age);
				cm.setEmail(email);
				cm.setAddress(address);

				mi.add(cm);

			} else if (yn.equals("n")) {
				System.out.println("입력중단");
				break;
			} else {
				System.out.println("입력여부 확인");
				continue;
			}

		} // while

		System.out.println("===============================");
		for (int i = 0; i < mi.size(); i++) {
			System.out.println((i + 1) + "번째 회원 정보");
			System.out.println("이름\t: " + mi.get(i).getName());
			System.out.println("나이\t: " + mi.get(i).getAge());
			System.out.println("이메일\t: " + mi.get(i).getEmail());
			System.out.println("주소\t: " + mi.get(i).getAddress());
			System.out.println("===============================");
		}
	} // main

}
