import org. junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertArraysEquals;
public class ArraySqaure {
	
	@Test
	public void testtheSquareArray() {
	 
	int[] myarray = {9, 2, 7, 0, 5};

	int[] expected = {0, 4, 25, 49, 81};

	int[] returned = Arrays.toStringsquarearray(numbers);
	
	assertArraysEquals(expected, returned); 

	}


}