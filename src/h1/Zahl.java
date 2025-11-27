package h1;

public class Zahl {
	boolean even, small, positive;
	int num;

	public void setEven() {
		even = num % 2 == 0;
	}

	public void setSmall() {
		small = num < 100;
	}

	public void setPositive() {
		positive = num > 0;
	}
}
