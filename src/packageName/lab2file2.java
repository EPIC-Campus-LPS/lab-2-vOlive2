package packageName;
import java.util.Scanner;
import java.lang.Math;
public class lab2file2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Guess the Square Root Game!");
		int score = 0;
		int randomNum = (int) (Math.random() * 99 + 1);
		System.out.print("What's the square root of " + randomNum + "?");
		double input = scan.nextDouble();
		if (input == Math.sqrt(randomNum)) {
			System.out.println("Nice job!");
			score++;
		} else {
			System.out.println("So close, it\'s " + Math.sqrt(randomNum));
		}
		randomNum = (int) (Math.random() * 99 + 1);
		System.out.print("What's the square root of " + randomNum + "?");
		input = scan.nextDouble();
		if (input == Math.sqrt(randomNum)) {
			System.out.println("Nice job!");
			score++;
		} else {
			System.out.println("So close, it\'s " + Math.sqrt(randomNum));
		}
		randomNum = (int) (Math.random() * 99 + 1);
		System.out.print("What's the square root of " + randomNum + "?");
		input = scan.nextDouble();
		if (input == Math.sqrt(randomNum)) {
			System.out.println("Nice job!");
			score++;
		} else {
			System.out.println("So close, it\'s " + Math.sqrt(randomNum));
		}
		System.out.println("You got " + score + "/3.");



	}

}
