package p2023_07_19;

class MyDate05{   
  private int year;    
  private int month;    
  private int day;

  public MyDate05(){ // 기본 생성자
  }
  public MyDate05(int new_year, int month, int new_day){
    // 매개변수를 가진 생성자
	  // 필드와 매개변수의 이름이 다른경우
	  // 매개변수를 통해서~ 필드값으로 초기화가 된다.
	  // 오른쪽의 매개변수를 왼쪽에 필드값에다가 할당을 해라!
	year=new_year;
	// 필드명과 매개변수명을 같게하면 오류가 발생하지는 않으나 아래서 초기화를 해도
	// 값 전달이 되지 않는다.
    this.month=month;
    // this. 이라는걸 붙여주면 값 전달이 잘 된다.
    day=new_day;
  }  
  public void print(){
    System.out.println(year+ "/" +month+ "/" +day); 
  }
}
public class ConstructorTest05 {     
  public static void main(String[] args) {
    MyDate05 d=new MyDate05();  
    d.print();

    MyDate05 d2=new MyDate05(2023, 7, 19);
    // 원하는 값으로 초기화 하기위한 방법
    d2.print();
    
    MyDate05 d3=new MyDate05();
    d3.print();
    
  }
}      