package p2023_07_21;

public class MathEx {

	public static void main(String[] args) {
		
		
		
		// Math 클래스
		// Math 클래스 = 정적 필드 + 정적 메소드
		
		// Math 클래스는 생성자가 제공되지 않기 때문에, Math 클래스로 직접 객체 생성 불가
//		Math m = new Math(); // 오류 발생
		
		
		System.out.println("E="+Math.E); // 오일러 상수
		System.out.println("PI="+Math.PI); // 원주율
		
// 정적............메소드, 메소드 오버로딩
		
		System.out.println("abs(-10)="+ Math.abs(-10)); // 절대값
		System.out.println("ceil()="+Math.ceil(3.14)); // 올림기능
		System.out.println("round()="+Math.round(10.5)); // 반올림
		System.out.println("floor()="+Math.floor(40.8)); // 내림
		
		
		System.out.println("max()="+Math.max(10,20)); // 최대값 두개이 값만 만족
		System.out.println("min()="+Math.min(2, 7));
		System.out.println("pow()="+Math.pow(2,3)); // 2의 3제곱
		System.out.println("random()="+Math.random()); // 난수발생
		// 0.0 <= random < 1.0
		int d = (int)(Math.random()*6)+1;
		System.out.println("주사위번호"+d);
		
		int r = (int)(Math.random()*45)+1; // 난수 발생 1~45
		System.out.println("로또" + r);
		
		
		System.out.println("sqrt()=" + Math.sqrt(16));
		
	}
	
}
