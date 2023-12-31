package p2023_08_04;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderEx {

// 키보드로 구구단 1개 입력받아서 출력
	// BufferedReader 클래스

	public static void main(String[] args) {

		InputStream in = System.in;
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("출력할 구구단");

		try {
			String is = br.readLine();

			int dan = Integer.parseInt(is);

			System.out.println("[" + dan + "단]");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " x " + i + " = " + dan * i);

			}

		} catch (Exception e) {
			System.out.println("잘못된 입력");
			e.printStackTrace();
		}

	}

}
