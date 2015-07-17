public class Shenfen {
	public static void main(String[] args) throws Exception {
		String [] s; 
		System.out.print("ÇëÊäÈë×Ö·û´®");
		Scanner input = new Scanner(System.in);
		s=input.next();
		int[] a = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += Character.digit(s.length, 10) * a[i];
			System.out.println("Totally sum£º" + sum);
			int mod = sum % 11;
			System.out.println("mod:" + mod);
			switch (mod) {
			case 0:
				System.out.print("1");
				break;
			case 1:
				System.out.print("0");
				break;
			case 2:
				System.out.print("x");
				break;
			case 3:
				System.out.print("9");
				break;
			case 4:
				System.out.print("8");
				break;
			case 5:
				System.out.print("7");
				break;
			case 6:
				System.out.print("6");
				break;
			case 7:
				System.out.print("5");
				break;
			case 8:
				System.out.print("4");
				break;
			case 9:
				System.out.print("3");
				break;
			case 10:
				System.out.print("2");
				break;

			}

		}

	}
}