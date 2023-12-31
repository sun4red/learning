package p2023_07_25;

import java.util.StringTokenizer;

public class SplitEx {
	public static void main(String[] args) {

		// String[] split(String regex)

		String jumin = "950101-1234567";

		StringTokenizer st = new StringTokenizer(jumin, "-");
		String j1 = st.nextToken();
		String j2 = st.nextToken();
		System.out.println("주민번호 앞자리 :" + j1);
		System.out.println("주민번호 앞자리 :" + j1);

		String[] j = jumin.split("-");
		System.out.println("주민번호 앞자리 : " + j[0]);
		System.out.println("주민번호 뒷자리 : " + j[1]);

		for (int i = 0; i < j.length; i++)
			System.out.println(j[i]);

		for (String s : j) 				// 향상된 for문
			System.out.println(s);

		String email = "totoro@naver.com";
		String[] e = email.split("@");
		System.out.println("아이디:" + e[0]);
		System.out.println("도메인:" + e[1]);
	}

}
