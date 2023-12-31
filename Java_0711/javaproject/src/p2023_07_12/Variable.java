package p2023_07_12;

import java.util.ArrayList;
import java.util.List;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 : 메모리상에 데이터를 저장하기 위한 기억공간의 이름
		// 변수를 만드는 방법 : 자료형 변수명 = 데이터(값);

		// 기본 자료형 변수

		// 1. 정수형 변수
		byte b1 = 10; // -128 ~ 127
//		byte b2 = 130; // 오버플로우 발생

		System.out.println("b1 = " + b1);
		// 변수명은 따옴표 사용 X
		// byte는 크기가 너무 작아서 잘 사용하지 않음

		short s1 = 32000;
		System.out.println("s1 = " + s1);
		// short도 작은 편이라 잘 사용 안함

		int i1 = 500000;
		System.out.println("i1 = " + i1);
		// int 정수형 변수 중에서 가장 많이 사용, 충분히 큰 값 사용 가능

		long l1 = 303032363456030300l;
		// 값 뒤에 l(대소문자 무관)을 붙여줘야 long형 변수, 붙이지않으면 int형으로 인식
		System.out.println("l1 = " + l1);

		// 2. 실수형 변수
		float ft1 = 3.14f;
		// 값 뒤에 f를 붙이지 않으면 double형으로 인식
		float ft3 = (float) 3.16;
		// double형(3.14)을 floatg형으로 강제 형변환
		System.out.println("ft1 = " + ft1);
		System.out.println("ft2 = " + ft3);

		double d = 42.195;
		System.out.println("d = " + d);

		// 소수 첫째 자리 까지 출력해보자 (반올림)
		System.out.printf("%.1f", d);
		System.out.println(); // printf는 줄바꿈 기능이 없다.

		// 소수 둘째 자리 까지
		System.out.printf("%.2f", d);

		// 3. 문자형 변수

		char c1 = 'k';
//		char c2 = 'kc'; // 오류 발생
		char c2 = '나';

		System.out.println();

		System.out.println("c1 = " + c1);
		System.out.println(c2);
		// char 잘 사용 안한다. string 많이 사용

		// 4. 논리형 변수
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1 = " + bn1);
		System.out.println("bn2 = " + bn2);

		// 사용하는 자료형과 실제 입력하는 값이 일치해야한다.

		// 기본자료형들은 main메소드 안에서만 정의가 되기때문에 지역변수이다.

		// 참조형 변수 : 클래스
		String st1 = "자바";
		String st2 = new String("자바");
		// 생성자를..?
		// 참조형 변수들은 자료가 저장된게 따로있다.
		// 값들은 heap 메모리 영역에만 저장되고
		// 변수는 값이 저장된 주소값만 있다. stack메모리에 시작주소값 저장

		System.out.println("st1 = " + st1);
		System.out.println("st2 = " + st2);

		if (st1 == st2) { // 주소 비교
			System.out.println("같은주소");
		} else {
			System.out.println("다른주소");
		}
		if (st1.equals(st2)) { // 데이터 값을 비교
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}

		// 참조형 변수 : 배열
		// 동일한 자료형의 데이터를 저장하기 위한 정적인 자료구조
		// 배열을 사용하면 코드가 더 간결해진다.

		int[] score = new int[3];
		score[0] = 8;
		score[1] = 9;
		score[2] = 10;

		int[] score2 = { 80, 90, 100 };
		System.out.println(score2[0]);
		System.out.println(score2[1]);
		System.out.println(score2[2]);

		for (int j = 0; j < score2.length; j++) {
			System.out.print(score2[j] + "\t");
		}
		System.out.println();

		// 참조형 변수 : 인터페이스(List)
		// 특징 1. 순차적인 자료
		// 특징 2. 여러가지 자료형의 데이터 모두 저장할 수 있다.
		// 특징 3. 동적으로 크기를 늘릴 수 있다.

//		List list = new List();
		// 인터페이스는 자체적으로 객체 생성을 할 수 없다. (?) 그래서 오류 발생
		List list = new ArrayList();
		list.add(30);
		list.add(3.14);
		list.add('j');
		list.add(true);
		list.add("자바");

		for (int k = 0; k < list.size(); k++) {
			System.out.print(list.get(k) + "\t");
		}
		System.out.println();
		System.out.print(list.get(4));
		
		
		

	}

}
