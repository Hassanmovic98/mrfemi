import java.util.Scanner;
public class Factor {
	public static void main (String [] args) {

	Scanner input = new Scanner(System.in); 

	System.out.print ("enter a number: ");
	int number = input.nextInt();

	 for(int i = 1; i <= number; i++){
		if(number % i == 0){
		System.out.print(i);
	 }
}

     }	


}