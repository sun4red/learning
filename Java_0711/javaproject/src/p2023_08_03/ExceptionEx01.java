package p2023_08_03;

public class ExceptionEx01 {

	public static void main(String[] args) {

		String data1 = null;
		String data2 = null;

		try {
			data1 = args[0];	// 예외 발생
			data2 = args[1];

		} catch (ArrayIndexOutOfBoundsException e) {
			// 배열의 범위를 벗어났을 때 발생하는 예외
			System.out.println("실행 매개값의 수가 부족합니다.");
			return;		// 메인 메소드를 빠져나가기 때문에 아래쪽의 내용을 실행하지않음
		}

		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);

		} catch (NumberFormatException e) {
			// NumberFormatException 숫자외의 값을 입력했을 때 발생되는 예외
			System.out.println("숫자로 변환할 수 없습니다.");

			// finally 안에 들어있는 내용은 예외가 발생하든 발생하지 않든 무조건 실행
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
