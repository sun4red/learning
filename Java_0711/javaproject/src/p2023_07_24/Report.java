package p2023_07_24;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Report {

	public static void main(String[] args) {

		// 오늘의 과제 : Calendar 클래스를 이용해서 오늘 날짜, 시간, 요일을 출력하는 프로그램

		Calendar c = new GregorianCalendar();

		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH) + 1;
		int d = c.get(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_WEEK) - 1;
		String yo[] = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };

		System.out.println(y + "-" + m + "-" + d + " " + yo[day]);

	}

}
