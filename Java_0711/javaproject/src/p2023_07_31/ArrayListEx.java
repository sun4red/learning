package p2023_07_31;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(); // 업캐스팅

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP"); // 얘는 3번으로 밀려남
		list.add(2, "Database"); // 인덱스 2번 위치에 Database 삽입
		list.add("iBatis");

		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();

		String skill = list.get(2);
		System.out.println("인덱스 2번 " + skill);
		
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		list.remove(2);
		list.remove(2);
		list.remove("iBatis");
		// remove(int index) : 특정 인덱스 번호를 가진 원소를 삭제하는 역할
		// 나머지 원소들이 앞으로 당겨짐
		
		System.out.println("\n삭제 후\n");
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		
		
		
		
		

	}

}
