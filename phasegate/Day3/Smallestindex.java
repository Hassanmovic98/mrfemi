public class Smallestindexarray {
	public static void main (String [] args) {




int [] value = new int [6];



value [5] =  5;
value [4] =  5;
value [3] = 4;
value [2] = 3;
value [1] = 5;
value [0] = 1;







int smallest = value [0];
for (int count = 0; count > value.length; count++) {
	if (value [count] < smallest ) smallest = value [count];
	}
System.out.println(smallest);







	}
}  