package a;

// 다른 패키지에 있는 클래스에서 접근하려면 접근 제어자가 public이 붙어있어야한다
// default도 안되며 import까지 해야한다.

public class Called {

	public void check() {
		System.out.println("다른 패키지 메소드 호출");
		
	}
	
}
