﻿package p2023_08_04;

import java.io.*;

public class FileInputStreamTest {
	public static void main(String[] args) {

		// 입력을 받아들이는 변수 선언
		int inputValue = 0;

		// FileInputStream 객체 선언
		FileInputStream file = null;

		try {
			// "read.txt"와 InputStream 형성
			file = new FileInputStream(
					"C:\\Users\\user\\Downloads\\(KD)데이터융합 자바(JAVA) 응용 SW개발자 취업과정(2023_07_11) (41)\\3\\read.txt");

			// file의 끝을 만날 때까지 데이터를 읽어 들임
			// read() 메소드는 File에서 한 byte씩 데이터를 읽어옴.
			// 읽어온 데이터를 int로 변환해서 리턴,파일의 끝을
			// 만나면 -1을 반환함.
			while ((inputValue = file.read()) != -1) {
				System.out.print((char) inputValue);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			if (file != null)
				try {
					file.close();
				} catch (Exception e) {
				}
		}

		// stream을 형성한 file을 닫음
		try

		{
			file.close();
		} catch (IOException io) {
			System.out.println(io.toString());
		}
	}// main() end
}
