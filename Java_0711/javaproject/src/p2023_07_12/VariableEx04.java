package p2023_07_12;

public class VariableEx04 {
	public static void main(String[] args) {
// double 타입이 float 타입보다 2배 가량 정밀도 높아 정확한 데이터 저장 가능
		// float : 소수점 이하자리 약 7 (6~9)
		// double : 소수점 자리 약 15 (15~19)

		// 실수값 저장
//		float var1 = 3.14; // f안붙여서 에러, 쓰고싶다면 강제 형변환
		// float는 4byte 인데 double은 8byte
		float var2 = 3.14f;
		double var3 = 3.14;

		// 정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;

//		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		// 소수점 이하 7자리까지 정확함, 8자리 표시 (반올림)
		System.out.println("var5 : " + var5);
		// 소수점 이하 15자리까지 정밀도를 가짐, 17자리 표시? (반올림)

		// e 사용하기
		double var6 = 3e6; // 10^6
		float var7 = 3e6F;
		double var8 = 2e-3; // 10^(-3)
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);

//		var8 = var8 * 1e3;
//		System.out.println(var8);
	}
}
