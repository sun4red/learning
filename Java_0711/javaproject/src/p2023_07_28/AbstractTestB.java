package p2023_07_28;

abstract class AbstractClassB{ // 추상클래스
	abstract void Method01(); // 추상메소드
	void Method02(){	// 일반 메소드
	   System.out.println("Method02:  추상클래스에서 구현");
	 }
}
abstract class MiddleClass extends AbstractClassB{
	// 추상클래스가 추상클래스를 상속 // [메소드 오버라이딩 지점1/둘중 하나만 메소드 오버라이딩 하면됨]
//	void Method01(){
//	  System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
//	}
	public void Method03(){
	  System.out.println("Method03: 추상클래스에서 구현");
	}
}
class SubClassB extends MiddleClass{ // 2단계 상속!
	void Method01(){ // [메소드 오버라이딩 지점2/둘중 하나만 메소드 오버라이딩 하면됨]
	  System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
	}
}
class AbstractTestB{
	public static void main(String args[]){
	   SubClassB obj =  new SubClassB();
	   // 추상클래스는 객체 생성이 안되기 때문에 최종 상속받은 클래스에서 객체 생성
	   obj.Method01(); // 메소드 오버라이딩된 메소드만 호출
	   obj.Method02(); // 조상 클래스로부터 상속받은 메소드
	   obj.Method03(); // 부모 클래스
	 }
}


