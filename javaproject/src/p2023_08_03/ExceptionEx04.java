package p2023_08_03;

public class ExceptionEx04 {

	public static void main(String[] args) {

		try {
			findClass();
			System.out.println("클래스 발견");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

	// 정적 메소드
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
							// 보통 오라클, MySQL 등 데이터베이스 드라이브 들어감

	}

}
