package p2023_07_20;

class MyDate10{   

  private int year;			// field, 멤버변수    
  private int month;    
  private int day;

  // 생성자 오버로딩 : 한개의 클래스에 여러개의 생성자를 정의 하는 것.
  // 조건 : 매개변수의 자료형, 매개변수의 갯수, 매개변수의 순서
  
  public MyDate10(){		// 기본 생성자
    this(2023, 1, 1);       // 같은 클래스안의 생성자 호출 
  }  
  public MyDate10(int new_year){
    this(new_year, 1, 1);                
  }  
  public MyDate10(int new_year, int new_month){
     this(new_year, new_month, 1);    
  }  
public MyDate10(int new_year,int new_month,int new_day){
    year=new_year;
    month=new_month;
    day=new_day;
  }    

  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}

public class ConstructorTest10 {     
  public static void main(String[] args) {
    MyDate10 d=new MyDate10(2023, 7, 19);  
    d.print();	// 생성자 호출
    MyDate10 d2=new MyDate10(2023, 7);     
    d2.print();
    MyDate10 d3=new MyDate10(2023);       
    d3.print();
    MyDate10 d4=new MyDate10();          
    d4.print();		// 기본 생성자 호출
  }
}