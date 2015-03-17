import java.util.Scanner;


public class LuhnAlgor {
	static void main(){
	System.out.print("Entercredit card number: \n");
	Scanner input = new Scanner(System.in);
	String number = input.nextLine();
	int length = number.length();
	int sum = 0;
	for(int i = 0; i < number.length(); i++ ){
		char c = number.charAt(i);
		int num = c-0;
				int product;
		if (i%2 !=0){
			product = num*1;
		}
		else{
			product = num*2;
		}
		if (product >9)
			product -= 9;
		sum += product;
		boolean valid = (sum %10 ==0);
		if (valid){
			System.out.println("Valid\r");
		}
		else{
			System.out.println("Invalid");
		}
	}
	}
}
	
	


