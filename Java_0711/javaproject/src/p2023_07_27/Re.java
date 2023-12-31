package p2023_07_27;

import java.text.DecimalFormat;

class CC {
	double c1(int r) {
		return 2 * Math.PI * r;
	}

	double c2(int r) {
		return Math.PI * r * r;
	}

	double c3(int r) {
		return 4 * Math.PI * r * r;
	}

	double c4(int r) {
		return 4.0 / 3 * Math.PI * r * r * r;
	}
}

public class Re {

	public static void main(String[] args) {
		CC c = new CC();

		DecimalFormat df = new DecimalFormat("0.00");
		int r = 5;

		System.out.println("원주\t:" + df.format(c.c1(r)));
		System.out.println("원의 면적\t:" + df.format(c.c2(r)));
		System.out.println("구의 표면적\t:" + df.format(c.c3(r)));
		System.out.println("구의 체적\t:" + df.format(c.c4(r)));

	}
}
