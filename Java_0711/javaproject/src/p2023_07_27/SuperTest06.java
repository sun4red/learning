package p2023_07_27;

class Point2D06{
  protected int x=10;
  protected int y=20;
  
  // 부모클래스의 기본 생성자. 자식 생성자 호출하면 자동으로 호출
  public Point2D06( ){
    System.out.println("슈퍼 클래스인 Point2D 생성자 호출");
  }
  
  // 매개변수가 추가됨
  
  // 자식클래스의 첫번째 라인에 써야한다.
  public Point2D06(int xx, int yy){
  x=xx; y=yy;
  }
}



// super()
// 1. super()는 부모 클래스의 매개변수를 가진 생성자를 호출할 때 사용한다.
// 2. super()는 자식 클래스의 생성자 안에서 첫번째 라인에 사용해야한다.
// 3. super()를 이용해서 부모 클래스의 매개변수를 가진 생성자를 호출하면
// 		더 이상 부모클래스의 기본생성자를 호출하지않는다.
class Point3D06 extends Point2D06{
  protected int z=30;
  public void print( ){
  System.out.println(x+", "+y+", "+z);
  }
  
  
  // 부모클래스의 기본생성자가 작성되어있지 않으면 오류가 발생함
  public Point3D06( ){		// 기본 생성자
	  super(50,50); // super () 쓰면 매개변수있는 생성자 호출
	  // 자식클래스의 생성자 안에서 써야한다. 그것도 가장 위쪽에 써야한다.
	  // 아래쪽에 쓰면 오류가 발생
	  // 부모클래스의 기본생성자는 호출하지않게됨
    System.out.println("서브 클래스인 Point3D 생성자 호출");
  }
}
class SuperTest06{
  public static void main(String[] args){
     Point3D06 pt=new Point3D06( );
    pt.print( ); // 생성자 호출
    
    // 부모클래스 기본생성자 호출, 자식클래스의 생성자도 호출
  }
}