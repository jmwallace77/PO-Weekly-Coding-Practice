class RockPaperScissors{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String player1 = input.nextLine();
		String player2 = input.nextLine();
		String result = oneTwoThreeShoot(player1,player2);
		System.out.println(result);
	}
	
	String oneTwoThreeShoot(String player1, String player2){
		if(player1.equals(player2)){
			return "TIE";
		}
		else if(player1.equals("rock")){
			if(player2.equals("scissors")){
				return "Player 1 wins";
			}
			if(player2.equals("paper")){
				return "Player 2 wins";
			}
		}
		else if(player1.equals("paper")){
			if(player2.equals("scissors")){
				return "Player 2 wins";
			}
			if(player2.equals("rock")){
				return "Player 1 wins";
			}
		}
		else if(player1.equals("scissors")){
			if(player2.equals("rock")){
				return "Player 2 wins";
			}
			if(player2.equals("paper")){
				return "Player 1 wins";
			}
		}
		return "";
	}
	
}