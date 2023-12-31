package p2023_07_12;

import java.util.Date;
import java.util.Random;
import java.util.*; // util에 있는 모든 클래스들 사용가능

// 패키지는 폴더라고 이해하자
public class Test {
	// public은 접근 제어자! , Test 사용자 정의 클래스 : 사용자가 직접 만든 클래스
	// 다른 것들은 Java에서 이미 만들어져있는 클래스
	// 소스코드 작성 시에는 같은 클래스끼리는 Tab키를 눌러 계단식으로 정렬

	// main() 메소드는 자바가상머신(JVM: java.exe이 가장 먼저 호출하는 메소드)
	// 1개의 클래스가 독립적으로 실행되기위해서는 반드시 main메소드가 필요하다.
	public static void main(String[] args) {
		// 여기도 public은 접근 제어자
		// static 은 공유(정적메소드) ..?
		// void 는 값을 부르지않아도 된다.
		// main메소드 ? 메소드는 형식상 괄호가 반드시 있다.
		// main이 없으면 컴파일만 하고 실행은 안해줌 자바가상머신이 main부터 찾아서 실행함
		System.out.println("java출력 성공");
		System.out.println("출력 성공");
		// 정적 필드
		// println은 메소드이기때문에 괄호가 있음
		// 일반 개발자가 할수있는 수준이 아니기 때문에 System이라는 클래스에서 불러온다.
		System.out.println("성공");

		Date d = new Date();
		System.out.println(d);
		
		
		Random r = new Random();
		System.out.println(r.nextInt(10));
		
		// java.lang 패키지 안에 들어있는 클래스는 import를 생략할수있다.
		
		
		

	}
}
