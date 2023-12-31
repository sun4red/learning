package p2023_08_01;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class StoredVector {
	public static void main(String[] args) {

		// Vector 객체 생성
		Vector v = new Vector(1, 1);

		// Vector에 객체 저장
		v.add("gemini");
		v.addElement(new Integer(10)); // Vector는 많은 메소드를 제공한다.
		v.addElement("johnharu"); // 많은 방식으로 데이터를 저장하고 출력
		v.addElement("gracedew");

		System.out.println(v);

		// 방법 1. Vector 자료구조에 저장된 데이터 출력
		System.out.println(v); // 전체 출력
		// 방법 2.
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + "\t");
		}
		System.out.println("다음");

		System.out.println("-------------------------");
		// 방법 3. 나열 형 출력방법
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+"\t"); //	가져올게 있을때 true리턴
		}
		System.out.println();
		System.out.println("-------------------------");
		
		// 방법 4. 반복자 Interator
		Iterator ie = v.iterator();
		while (ie.hasNext()) {
			System.out.print(ie.next()+"\t");
		}
		System.out.println();
		System.out.println("-------------------------");
		
		
		
		// Vector에 저장된 객체의 개수를 구함
		int length = v.size();

		// 처음부터 순차적으로 객체를 꺼냄
		for (int i = 0; i < length; i++) {
			System.out.println(v.get(i));
		}
		
		

		System.out.println(v.firstElement());
		System.out.println(v.indexOf("johnharu"));
		System.out.println(v.isEmpty());

		// 인덱스가 2인 객체를 삭제
		v.remove(2);	// 2번을 삭제하고나면 3번이 2번이됨.
		System.out.println(v.elementAt(2));

		// 인덱스가 2인 객체 값을 "park"로 설정
		v.set(2, "park");
		System.out.println(v);
	}
}
