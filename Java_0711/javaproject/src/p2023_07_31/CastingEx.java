package p2023_07_31;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ex1.
//			Calendar c = new Calendar();		// 캘린더 추상클래스
		Calendar c1 = Calendar.getInstance(); // 정적메소드를 불러오는 방식

		Calendar c2 = (Calendar) new GregorianCalendar(); // 업캐스팅
		// 자동형변환이 되기때문에 생략)
		// 업캐스팅 되면 Calendar가 상속해준 메소드만 호출할 수 있다.
		// 자식클래스의 메소드는 호출할 수 없다.
		GregorianCalendar c3 = new GregorianCalendar();

		// ex2.
//			List li = new List(); 오류 발생 
		// List 인터페이스는 자체적으로 객체를 생성할 수 없다.
		// 구현클래스가 만들어져있어야한다.

		List list = new ArrayList();
		// 왼쪽은 부모클래스 오른쪽은 자식클래스, 업캐스팅
		ArrayList al = new ArrayList();
		// 자식클래스 내에서 생성하면 자식메소드와 부모메소드를 모두 사용한다.

		// ex3.
		// add (Object e)
		list.add(10); // Object e = new Integer(10); 박싱+업캐스팅
		list.add(3.14); // Object e = new Double(3.14); 박싱+업캐스팅
		list.add('j'); // Object e = new Character('j'); 박싱+업캐스팅
		list.add(true); // Object e = new Boolean(true); 박싱+업캐스팅
		list.add("자바"); // Object e = new String("자바"); 박싱+업캐스팅

		// Boolean.equals(Object e)

		if ("java".equals(new String("java"))) { // 업캐스팅
			System.out.println("같은값");
		} else {
			System.out.println("다른값");
		}

		if (new Integer(30).equals(new Integer(30))) {
			System.out.println("같은값");
		} else {
			System.out.println("다른값");
		}

		if (new Double(3.14).equals(new Double(3.14))) {
			System.out.println("같은값");
		} else {
			System.out.println("다른값");
		}

		// 다운 캐스팅

		// ex1.
		List lt = new ArrayList(); // 업캐스팅
		// add(Object e)
		lt.add(new String("자바")); // 업캐스팅
		lt.add("오라클");
		lt.add("JSP");
		lt.add("스프링");
		lt.add("파이썬");
		lt.add("텐스플로우");

		// Object get(int index)

		Object obj = lt.get(0);
		String s = (String) lt.get(0); // 다운캐스팅

		for (int i = 0; i < lt.size(); i++) {
			// 자료구조는 size메소드를 가지고 불러온다.

			Object ob = lt.get(i);

			String str = (String) lt.get(i);
			System.out.println(str);

		}

		// ex2.
		List ls = new ArrayList(); // 업캐스팅

		// add(Object e)

		ls.add(10); // 오토 박싱 + 업캐스팅
		ls.add(200);
		ls.add(3000);
		ls.add(40000);
		ls.add(500000);

		// Object get (int index)

		Integer it = (Integer) ls.get(0); // 다운캐스팅
		int n1 = it.intValue(); // 언박싱

		int n2 = ((Integer) ls.get(0)).intValue(); // 한줄로

		for (int i = 0; i < ls.size(); i++) {
			Object ob = ls.get(i); // Object형

			Integer t = (Integer) ls.get(i); // 두줄
			int n3 = t.intValue();
			System.out.println(n3);

			int n4 = ((Integer) ls.get(i)).intValue(); // 한줄
			System.out.println(n4);
		}

	}

}
