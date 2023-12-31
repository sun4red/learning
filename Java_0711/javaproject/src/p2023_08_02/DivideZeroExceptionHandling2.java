package p2023_08_02;

public class DivideZeroExceptionHandling2 {
    public static void main( String[] args ) {
    	
	// int type의 변수 선언
 	int b = 20;
	int a = 0;
	int c = 0;

	// 두 수의 나눗셈 결과를 구한다
	try {
		c = b/a;
		int total = a + b;
		int sub = b-a;		
		System.out.println( c );		
	} catch ( Exception e ) {		
		//java.lang.Throwable의 메소드
		// 예외 정보를 자세히 출력
		e.printStackTrace();		// 프린트 기능이 내장되있어서 따로 작성안해도됨
									// 리턴값이 void 이기때문에 print를 쓰면안된다.
		
		System.out.println("-구분선-");
		
		// 예외 정보를 문자열로 반환함.
		System.out.println( e.getMessage() );	
		// 메세지를 스트링 형태로 돌려줌 그래서 print 메시지 써야함

		System.out.println("-구분선-");

		// 예외의 간단한 설명문을 반환함.
		System.out.println( e.toString() ); 	
		
		System.out.println("0으로 나눌 수 없음");
	}	
   }// main end
}

		