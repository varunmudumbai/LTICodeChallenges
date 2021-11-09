import java.util.Scanner;
public class TigerEars {

	public static void main(String[] args) {
		
		int noOfTigers,totalTigerEars=0;
		System.out.print("Enter the number of tigers - ");
		Scanner reader = new Scanner(System.in);
		noOfTigers = reader.nextInt();
		if(noOfTigers<0) {
			System.out.println("Tigers cannot be less than ZERO!");
			System.exit(0);
		}
		Solution1 s = new Solution1();
		totalTigerEars=s.countEars(noOfTigers);
		System.out.println("Total Ears are - "+totalTigerEars);
	}
	
}
class Solution1{
	
	int countEars(int tigers) {
		//int totalTigerEars=0;
		if(tigers==0) {
			return 0;
		}
		else {
			return 2+countEars(--tigers);
		}
	}
}
