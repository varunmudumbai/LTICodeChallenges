import java.util.Scanner;

public class Predicates {

	public static void main(String[] args) {
		int len=0;
		String input="";
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter length to consider");
		len=reader.nextInt();
		System.out.println("Enter string of words");
		input=reader.next();
		input = input+reader.nextLine();
		System.out.println("Input is -"+input);
		String data[]=input.split(" ");
		//System.out.println("Data is "+Arrays.toString(data));
		for (String word : data) {
			if(word.length()<=len) {
				System.out.println(word+" ");
			}
		}
		reader.close();
	}

}
