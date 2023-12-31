package p2023_07_31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Collections04 {

	public static void main(String[] args) {
		List list = new ArrayList();
//	ArrayList list = new ArrayList();

		list.add("하나");
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
//	list.add(6);
		System.out.println(list); // 리스트 전체

		System.out.println(list.get(2)); // 인덱스 2번 추출
		System.out.println(list.get(4)); // 인덱스 4번 추출
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
//  System.out.println( i + " 번째 요소는 " + list.get(i));
			Object s = list.get(i);
//	String s =(String)(list.get(i)); // string 클래스가 아닌게 있어서 오류 발생 
			System.out.println(s);
		}
		
		System.out.println("------------------------");

		// 향상된 for문
		// for (값을 받기 위한 변수 : 숫차적인 자료 구조)
		for (Object s : list) {
			System.out.print(s + "\t");
		}
		System.out.println();
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
		
		
		
		

	Iterator elements=list.iterator();    
	while(elements.hasNext()) { // 가져올 데이터가 있을 때만 true값 return
      System.out.println("\t\t" + elements.next());
	}	// next() : 데이터를 1개씩 가져오는 역할

	}
}
