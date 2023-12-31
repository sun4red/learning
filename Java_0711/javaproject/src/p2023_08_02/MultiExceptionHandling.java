package p2023_08_02;

public class MultiExceptionHandling {
    public static void main( String[] args ) {
		
	int value = 20;
	int div = 0;
	int[] intArray = { 1, 2, 3 };

	try {
//		   int arrayValue = intArray[4];
//		  System.out.println( arrayValue );	

	      // 두수의 나눗셈을 구함
	      int result = value / div;			// 예외가 발생하면 아래쪽 문장을 더 실행하지않는다
	      System.out.println( result );

		  // 배열의 특정 값을 저장
          int arrayValue = intArray[4];
		  System.out.println( arrayValue );	    

	      
	    // ArithmeticException 숫자를 0으로 나눌 때 발생하는 예외
	    } catch ( ArithmeticException ae ) {		
			System.out.println( ae.toString() );
			 System.out.println("0으로 나눔");
			 
			 
		// ArrayIndexOutOfBoundsException : 배결의 범위를 벗어났을 때 발생하는 예외
	    } catch ( ArrayIndexOutOfBoundsException ai ) {
			ai.printStackTrace();
			System.out.println("배열 범위 벗어남");
	    } 
    }    
}



