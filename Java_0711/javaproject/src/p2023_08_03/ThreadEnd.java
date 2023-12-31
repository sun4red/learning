package p2023_08_03;

public class ThreadEnd extends Thread {
	
    public void run() {
		// thread가 시작되면 실행되는 문장
		for( int i=1 ; i<=20 ; i++ ) {
			System.out.println( "run number = " + i );
		}
    }

    public static void main( String[] args ) {		
		ThreadEnd tt = new ThreadEnd();
		// thread를 실행시킴
		tt.start();				// 실행 가능한 상태 : override된.....
								// run 메소드가 자동으로 호출된다.
		
		// main()내에서 화면에 101부터 120까지 출력
		for( int i=101 ; i<=120 ; i++ ) {
			System.out.println( "-------> main number = " + i );
		}
    }

}
