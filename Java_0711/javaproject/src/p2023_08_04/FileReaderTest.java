﻿package p2023_08_04;

import java.io.*;

public class FileReaderTest {
	public static void main(String[] args) {

		// FileReader 객체 선언
		FileReader file = null;
		int inputValue = 0;

		try {
			// "data.txt" File과 stream 형성
			file = new FileReader(
					"C:\\Users\\user\\Downloads\\(KD)데이터융합 자바(JAVA) 응용 SW개발자 취업과정(2023_07_11) (41)\\3\\data.txt");

			// file의 끝을 만날 때까지 데이터를 읽어 들임
			while ((inputValue = file.read()) != -1) {
				System.out.print((char) inputValue);
			}

			// stream을 닫음
			file.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			if (file != null)
				try {
					file.close();
				} catch (Exception e) {
				}
		}
	}// main() end
}
