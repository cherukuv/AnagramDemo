
import java.util.Arrays;
import java.util.Scanner;

public class AnagramDemo {

	 public static char getLetter(int i)
	 {
	   return (char) (i + 96);
	 } 
  
	 public static int getInteger(char i, int x)
	 {
		 int value = (int)i-96+x;
		 if(value>26)
			 value = value-26;
		 else if(value<1)
			 value=value+26;
		 return value;
	 } 
	 
	 // method to check for the anagrams without using library methods
	 public static boolean isAnagram(String a, String b, int x) {
		// if length itself not equal, return false.
		if (a.length() != b.length()){
			return false;
		}
		// else do the brainstorming!
		boolean anagram = true;
		char[] source = new char[a.length()];
		for (int i = 0; i < a.length(); i++) {
			source[i]=getLetter(getInteger(a.charAt(i),x));
		}
		
		char[] dest = b.toCharArray();

		//performing sorting of string
		Arrays.sort(source);
		Arrays.sort(dest);

		anagram= Arrays.equals(source,dest);
		return anagram;
	 }
 
	 public static void main(String[] args) {

		 System.out.println("Please enter first string\n");
		 Scanner sc = new Scanner(System.in);
		 String a = sc.nextLine();
		 System.out.println("Please enter Second string\n");
		 String b = sc.nextLine();
		 System.out.println("please enter the shift\n");
		 Scanner in = new Scanner(System.in);
		 int x = in.nextInt();

		 System.out.println("Both the Strings are");
		 if (isAnagram(a, b, x) || isAnagram(b,a,x))
			 System.out.println("ANAGRAMS after one of the String has shift of"+x);
		 else
			 System.out.println("NOT ANAGRAMS even after shift");
	 }
}

 
