package packageName;
//import java.util.Scanner;
public class lab2flie3 {
	public double getL(double a, double b) {
		if (a >= b) {
			return a;
		}
		return b;
	}
	public double getL(double a, int b) {
		return getL(a, (double) b);
	}
	public double getL(int a, double b) {
		return getL((double) a, b);
	}
	public double getL(int a, int b) {
		return getL((double) a, (double) b);
	}
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
	}
}
