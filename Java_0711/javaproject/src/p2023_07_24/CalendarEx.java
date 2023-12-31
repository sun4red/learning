package p2023_07_24;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {

	public static void main(String[] args) {

		// 3. Calendar 클래스
		// 얘는 직접 new 연산자로 생성하면 에러가 남

//		Calendar c1 = new Calendar();			// 오류발생
		Calendar c2 = new GregorianCalendar(); // 업캐스팅 자료 형변환?
		// 왼쪽은 부모 클래스 오른쪽은 자식 클래스 형변환이 일어남

		Calendar c = Calendar.getInstance(); // 정적 메소드
		System.out.println(c);
		// unix time 표시 기준시간 1970년 1월 1일 0시 0초 부터 지난 시간

		System.out.println(Calendar.YEAR);

		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH) + 1; // 월 : 0 ~ 11
		int d = c.get(Calendar.DATE);

		System.out.println(y);
		System.out.println(m);
		System.out.println(d);
		System.out.println(y + "-" + m + "-" + d);

		int h1 = c.get(Calendar.HOUR); // 12시간
		int h2 = c.get(Calendar.HOUR_OF_DAY); // 24시간

		int ap = c.get(Calendar.AM_PM); // 0:오전, 1:오후
		if (ap == 0) {
			System.out.print("오전");
		} else {
			System.out.print("오후");
		}
		int mm = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		int day = c.get(Calendar.DAY_OF_WEEK);

		System.out.println(h1 + ":" + mm + ":" + s);
		System.out.println(h2 + ":" + mm + ":" + s);

		System.out.println(day);
	}

}
