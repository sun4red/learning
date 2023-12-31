package p2023_07_28;

 interface IHello02{
  public abstract void sayHello(String name);
}
interface IGoodBye02{
  public abstract void sayGoodBye(String name);
}
//두 인터페이스로부터 상속을 받는 클래스 설계

// 1. 자바에서는 인터페이스의 다중상속을 허용한다.
// 2. 인터페이스 2개를 상속 받을 때 상속받는 순서는 바뀌어도 상관없다.

class SubClass02 implements IHello02, IGoodBye02{
  public void sayHello(String name){
     System.out.println(name+"씨 안녕하세요!");
  }
  public void sayGoodBye(String name){
     System.out.println(name+"씨 안녕히 가세요!");
  }
}
class InterfaceTest02{
  public static void main(String[] args) {
	 
    SubClass02 test= new SubClass02();
    test.sayHello("써넝");
    test.sayGoodBye("선홍");
  }   
}         