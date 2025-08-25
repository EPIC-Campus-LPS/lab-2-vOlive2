package packageName;
import java.util.Scanner;
import java.lang.Math;
public class lab2file1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int indexV = 0;
		char[] strl = str.toLowerCase().toCharArray();
		
		for(int i = 0; i < str.length(); i++) {
			if(strl[i] == 'a' || strl[i] == 'e' || strl[i] == 'i' || strl[i] == 'o' || strl[i] == 'u') {
				indexV = i;
				break;
			}
		}
		
		System.out.println("Number of letters: " + str.length());
		System.out.println("Index of the first vowel: " + indexV);	
		System.out.println("Uppercase: " + str.toUpperCase());
		System.out.println("Secert String: " + str.substring(0,5).toLowerCase()+str.substring(str.length()-3).toUpperCase()+str.length());

	}

}
