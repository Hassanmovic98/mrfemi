public class uniquenumbers {
	public static void main (String [] array) {

	int total = 0;

	int count = 0;

	int [] Array  = { 1, 2, 3, 3, 2};

	for (int i = 0; i < array.length; i++) {
		count = 0;
		
            for (int j = 0;j < array.length; j++) {
		 
		if (Array[i] == Array[j]){
		  count++;
		}
	  	
		if(count == 1){
		total = total +Array[i];
		}	
	  }
	
	}
	
	System.out.print(total);

	}

  
}