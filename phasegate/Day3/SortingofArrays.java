import java.util.Arrays;
public class SortingofArrays{
    public static int[] sortArrayDescending(int[] numbers) {
        
        for (int counter = 0; counter < numbers.length; counter++) {
            for (int count = 0; count < numbers.length ; count++) {
                if (numbers[count] < numbers[count +1]) {
                  
                    int temp = numbers[count ];
                    numbers[count] = numbers[count + 1];
                    numbers[count + 1] = temp;
          }
         }
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] inputArray = {3, 1, 5, 8, 6};
        int[] sortedArray = sortArrayDescending(inputArray);

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
    