package p2023_08_03;

public class ThreadLife implements Runnable{
    
    public void run() {	// 메소드 오버라이딩
		for( int i=1 ; i<21 ; i++ ) {
			// thread의 이름과 정수 출력
	  System.out.println( Thread.currentThread().getName() +
										" number = " + i );
		}
    }

    public static void main( String[] args ) {	
		ThreadLife tl = new ThreadLife();

		// 첫 번째 Thread 생성
		Thread first = new Thread( tl, "first1" );
		// 두 번째 Thread 생성
		Thread second = new Thread( tl, "second1" );
		// 세 번째 Thread 생성
		Thread third = new Thread( tl, "third1" );
		
		second.start();
		first.start();
		third.start();
    }
}

