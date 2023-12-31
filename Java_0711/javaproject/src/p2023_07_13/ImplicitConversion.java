package p2023_07_13;

public class ImplicitConversion {

    public static void main ( String[] args ) {
    	
	// char 변수 선언 및 초기화.
	char charValue = 'a';
	System.out.println( "charValue = " + charValue );
 
	// int 변수 선언 및 'a'의 값으로 초기화.
//	int intValueOfChar = charValue;
	int intValueOfChar = 'a';
	// ASCII 코드로 저장되어 a > 97로 표시 2byte 자료를 4byte 자료로 넘기기 때문에 자동 형변환이 일어난다.
	System.out.println( "intValueOfChar = " + intValueOfChar );

	// int 변수 선언 및 초기화.
	int intValue = 30;
	System.out.println( "intValue = " + intValue );

	// float 변수 선언 및 intValue 변수 값 할당
	float floatValue = intValue;
	System.out.println( "floatValue = " + floatValue );
	// 자동 형변환 int(4) -> float(4) : 30.0

	// double 변수 선언및 floatValue,intValue 변수 값 할당
	double doubleValue1 = floatValue;
	// 자동 형변환 float(4) -> double(8)
	double doubleValue2 = intValue;
	// 자동 형변환 int(4) -> double(8)
	System.out.println("doubleValue1 ="+doubleValue1);
	System.out.println("doubleValue2 ="+doubleValue2);

    }//main end
}//class end



