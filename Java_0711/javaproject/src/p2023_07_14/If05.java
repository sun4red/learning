package p2023_07_14;

public class If05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 난수 발생 공식
		// 난수 = (정수화) (Math.random() * (상한값-하한값+1)+하한값;

		// 난수 발생 : 0.0 <= Math.random() < 1.0

		// Math 는 생성자가 없기 때문에 객체를 생성하려하면 오류가 발생함
		System.out.println("E=" + Math.E);
		System.out.println("PI=" + Math.PI);
		System.out.println("난수=" + Math.random());
		// api 봤을 때 static이 붙어있는 필드를 정적필드라고함

		int num = (int) (Math.random() * 6) + 1;
		// 0 * 6 + <= random < 1 * 6 + 1
		// 6만 곱하면 5.9999... 까지만 가능
		// int로 형변환 하면 소수점 이하 자리 버리기 때문에 5, +1 해줘야 6이 출력

		if (num == 1) {
			System.out.println(num + "번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println(num + "번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println(num + "번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println(num + "번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println(num + "번이 나왔습니다.");
		} else
			System.out.println(num + "번이 나왔습니다.");

		System.out.println("1~45사이의 난수");
		int r = (int) (Math.random() * 45) + 1;
		System.out.println("난수 r = " + r);

	}
}
