package MainPackage;

public class MyInteger {

	public static void main(String[] args) {
		MyInteger i = new MyInteger(8);
		System.out.println("Is " + i.getValue() + " Even?" + i.isEven());
		System.out.println("Is " + i.getValue() + " Odd?" + i.isOdd());
		System.out.println("Is " + i.getValue() + " Prime?" + i.isPrime());
	}

	private static int value;

	public MyInteger(int i) {
		this.value = i;
	}

	public static int getValue() {
		return value;
	}

	public boolean isEven() {
		return (this.value % 2 == 0);
	}

	public boolean isOdd() {
		return (this.value % 2 != 0);
	}

	public boolean isPrime() {
		int i = 3;
		if (this.value == 2)
			return true;
		if (this.isOdd()) {
			while (i < Math.sqrt(this.value)) {
				i += 2;
				if (this.value % i == 0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public static boolean isEven(int i) {
		MyInteger val = new MyInteger(i);
		return val.isEven();
	}

	public static boolean isOdd(int i) {
		MyInteger val = new MyInteger(i);
		return val.isOdd();
	}

	public static boolean isPrime(int i) {
		MyInteger val = new MyInteger(i);
		return val.isPrime();
	}

	public static boolean equals(int i) {
		return i == MyInteger.getValue();
	}

	public static boolean equals(MyInteger i) {
		return i.getValue() == MyInteger.getValue();
	}

	public static int parseInt(char[] carray) {
		String str = new String();
		for(char i : carray){
			str+=Character.toString(i);
		}
		return Integer.parseInt(str);
	}
	public static int parseInt(String str){
		return Integer.parseInt(str);
	}
}
