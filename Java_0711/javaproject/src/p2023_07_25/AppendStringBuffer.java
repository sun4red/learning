package p2023_07_25;

public class AppendStringBuffer {
	public static void main(String[] args) {

		// StringBuffer 객체 생성
		StringBuffer sb1 = new StringBuffer("gemini");
		System.out.println("sb1 = " + sb1);

		// StringBuffer sb1에 문자열을 추가해 새로운 객체 생성
		StringBuffer sb2 = sb1.append(" is beautiful");
		System.out.println("sb2 = " + sb2);
		System.out.println("sb1 = " + sb1);
		// 변경된 값을 heap메모리에 새로운 공간에 저장하지않음

		// 정수형 데이타 형을 추가
		System.out.println(sb1.append(1004));
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);
		// 같은 주소이기 때문에 같은 결과가 나옴

		if (sb1 == sb2) {
			System.out.println("같은주소");

		} else {
			System.out.println("다른주소");
		}

		String str = new String(sb1); // StringBuffer를 String으로 변환
		System.out.println(str.toUpperCase());
	}
}
