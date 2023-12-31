package p2023_07_28;

abstract class AbstractClass{		// 부모클래스(추상클래스)
	abstract void Method01();		// 추상메소드
									// 이름만 있고 내용이 없는 메소드
	void Method02(){
	   System.out.println("Method02:  추상클래스에서 구현");
	 }
}

class SubClass extends AbstractClass{

	
	// 메소드 오버라이딩을 하지않으면 오류 발생
	
	// 추상클래스를 상속 받으면, 추상클래스 안에있는 추상 메소드를 자식 구현 클래스에서 반드시 메소드 오버라이딩을 해야한다.
	
	@Override
	void Method01() {
		// TODO Auto-generated method stub
		System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
	}
	
//	void Method01(){
//		System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
//	}	
}
class AbstractTest01{
	public static void main(String args[]){
//		AbstractClass abs = new AbstractClass();
		// 추상클래스는 자체적으로 객체 생성이 불가능
	   SubClass obj =  new SubClass();
	   obj.Method01();	// 메소드 오버라이딩된 메소드가 호출된다.
	   obj.Method02();	// 부모 클래스부터 상속 받아서 사용
	 }
}


