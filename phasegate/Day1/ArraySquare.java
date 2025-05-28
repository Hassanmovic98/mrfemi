import java.util.Arrays;
public class ArraySquare{
    public static int[] squarearray(int[] numbers) {
        
        int arraySquare = 0;
	int ascendingNumber = 0;
	int [] squareNumber = new int [numbers.length];

	for (int counter = 0; counter < numbers.length; counter++){
	    for (int count = 0; count < numbers.length; count++){

			if(numbers[count] > numbers[counter]) {

				ascendingNumber = numbers [count];
				numbers[count] = numbers[counter];
				numbers[counter] = ascendingNumber;
			}

		arraySquare = numbers[count] * numbers[count];
		squareNumber[count] = arraySquare;
		
		if(numbers.length == 0){
		   int arraySqaure={};
		   returned squareNumber;
		}
		else {
		if(numbers[count] < 0) {
		   int arraySquare = {9, 2, 7, 0, 5};
		 } else {
		    squarenumber[count] = numbers[count] * numbers[count];
		  }
	      }
		
                return squareNumber;
          }

          public static void main(String[] args){
		    
	     int[] numbers = {9, 2, 7, 0, 5};
	
	      System.out.print(Arrays.toString(squarearray(numbers)));
	  }

 }


