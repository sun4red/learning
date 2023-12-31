package p2023_08_01;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {

	public static void main(String[] args) {

		Map<String, String> map = new Hashtable<String, String>();

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("아이디와 비밀번호 입력해주세요");
			System.out.println("아이디 : ");
			String id = sc.nextLine();
			System.out.println("비밀번호 : ");
			String pw = sc.nextLine();

			if (map.containsKey(id)) {
				// 사용자가 입력한 ID값이 map의 key값으로 있으면 true return
				
				
				if (map.get(id).equals(pw)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력한 아이디가 존재하지않습니다.");
			}
		}

	}

}
