package packageName;
import java.util.Scanner;
import java.lang.Math;
public class lab2file1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String strl = str.toLowerCase();
		double a = (double) strl.indexOf("a");
		double e = (double) strl.indexOf("e");
		double i = (double) strl.indexOf("i");
		double o = (double) strl.indexOf("o");
		double u = (double) strl.indexOf("u");
		
		System.out.println("Number of letters: " + str.length());
		System.out.println("Index of the first vowel: " + Math.min(Math.min(a, e), Math.min(Math.min(i, o), u)));	
		System.out.println("Uppercase: " + str.toUpperCase());
		System.out.println("Secert String: " + str.substring(0,5).toLowerCase()+str.substring(str.length()-3).toUpperCase()+str.length());

	}

}
