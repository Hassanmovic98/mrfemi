import java.util.Random;
import java.util.Scanner;
public class Subtractcalculator {
	 public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	

	int score  = 0;
	int attempt = 0;
	int incorectResult = 0;
	
	while(counter < 10) {
	int choiceA = (int)Math.random()*9)-1;
	int choiceB = (int)Math.random()*9)-1;

    for(int count = 1; count <2; count++) {
	   if (choiceA > choiceB ) {
	    System.out.print("subtract" choiceA+ " -" + choiceB));
		System.out.println ("enter your answer:  ");
			int userAnswer = input.nextInt();
			if (result == correctresult && counter == 10) {
					score++;
					 attempt++;
					   break;
				          }
			 else if(userAnswer !=  correctAnswer && userAnswer ==2)

                        System.out.println("wronganswer" + correctResult);
                    }
                } else {
                    continue; 
                }
            }

            counter++;































import java.util.Random;
import java.util.Scanner;

public class Subtractcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        int attempt = 0;
        int incorrectResult = 0;
        int counter = 0;

        while (counter < 10) {
            int choiceA = rand.nextInt(9) + 1; // generates 1 to 9
            int choiceB = rand.nextInt(9) + 1;

            for (int count = 1; count < 2; count++) {
                int correctResult = choiceA - choiceB;

                if (choiceA > choiceB) {
                    System.out.print("Subtract " + choiceA + " - " + choiceB + ": ");
                    int userAnswer = input.nextInt();

                    if (userAnswer == correctResult) {
                        score++;
                        attempt++;
                        System.out.println("✅ Correct!");
                        break;
                    } else {
                        incorrectResult++;
                        attempt++;
                        System.out.println("❌ Incorrect. The correct answer was " + correctResult);
                    }
                } else {
                    continue; // skip this round if A is not greater than B
                }
            }

            counter++;
        }

        // ✅ Final output (only correct answers, joined)
        System.out.println("\n=== Quiz Finished === Correct Answers: " + score);
    }
}

	
	









	
		
  
		














	}

}	
