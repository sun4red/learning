package p2023_07_24;

public class SubstringEx {

	public static void main(String[] args) {

		// 아래와 같은 주민번호가 있을때, 남자인지 여자인지를 판별하는 프로그램을 작성하시오

		String jumin = "950101-2234567";

		String s = jumin.substring(7, 8);
		if (s.equals("1") || s.equals("3")) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}

		char c = jumin.charAt(7);
		if (c == '1' || c == '3') {
			// character 값 비교 시 ' ' 로 작성
			System.out.println("남자");
		} else if (c == '2' || c == '4') {
			System.out.println("여자");
		} else {
			System.out.println("잘못된 정보");
		}

	}

}
