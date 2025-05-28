public class TicTacToe {
	public static void main (Strin[] args) {

	char[][] =  { {' ','  ',' '},
		     {' ','  ','  '},
		     {'  ','  ',' '}}
   
	Scanner input = new Scanner(System.in);
	
	System.out.println("Where would you play? (1-9)") 
	Syting userInput = input.nextLine();
	Rander rand = new Random;
	int computerPlay - rand.nextInt(9)+ 1;  
	

















	while(true) {
		int computerMove = rand.nextInt(9) + 1;
		if (isValidMove(board, computerPlay)) {





   private static void boolean isValidMove(char [] [] board,int position) {
	Switch(position) {
		case "1":
			return (board[0][0] == '' );
		case "2":
			return (board[0][1] == ' ');	
		 case "3":
			return (board[0][2] == ' ');
		case "4":
			return (board[1][0] == ' ');
		case "5":
			return (board[01][1] = ' ');
		case "6":
			return  (board[1][2] = ' ');
		case "7":
			return  (board[2][1] = ' ');
		case "8":
			return  (board[2][1] = ' ');
		case "9":
			return   (board[2][2] = ' ');
		  default:
			return false; 




  private static void playerTurn (char [] [] board,Scanner input) {
   System.out.println ("where where would you like to play? (1-9);
    String userInput = scanner.nextLine();

	Switch(userInput) {
		case "1":
			board[0][0] = 'X';
			break; 
		case "2":
			board[0][1] = 'X';
			break;
		 case "3":
			board[0][2] = 'X';
			break;
		case "4":
			board[1][0] = 'X';
			break;
		case "5":
			board[01][1] = 'X';
			break;
		case "6":
			board[1][2] = 'X';
			break;
		case "7":
			board[2][1] = 'X';
			break;
		case "8":
			board[2][1] = 'X';
			break;
		case "9":
			board[2][2] = 'X';
			break;
		  default:
			System.out.print(*:(*);
	}


}
 



			
System.out.println(board[0][0] + "|" + board[0][1]+ "|" +board[0][2]
System.out.println("-+-+-");
System.out.println(board[1][0] + "|" + board[1][1]+ "|" +board[1][2]
System.out.println("-+-+-");
System.out.println(board[2][0] + "|" + board[1][1]+ "|" +board[1][2]

















	}


}