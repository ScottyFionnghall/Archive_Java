class GuessGame{
	Player p1;
	Player p2;
	Player p3;
	 public void startGame(){
	 	p1 = new Player();
	 	p2 = new Player();
	 	p3 = new Player();
        int round = 0;
	 	int guessp1 = 0;
	 	int guessp2 = 0;
	 	int guessp3 = 0;

	 	boolean p1isright = false;
	 	boolean p2isright = false;
	 	boolean p3isright = false;


	 	System.out.println("Guess the number");

	 	while (true) {
	 		  int targetNumber = (int) (Math.random() * 999);
	 		System.out.println("The Correct answer is " + targetNumber);

	 		p1.guess();
	 		p2.guess();
	 		p3.guess();
	 		round = round + 1;

	 		guessp1 = p1.number;
	 		System.out.println ("First player says that the number is " + guessp1);
	 		guessp2 = p2.number;
	 		System.out.println ("Second player says that the number is " + guessp2);
	 		guessp3 = p3.number;
	 		System.out.println ("Third player says that the number is " + guessp3);

	 		if (guessp1 == targetNumber){
	 			p1isright = true;
	 		}
	 		if (guessp2 == targetNumber){
	 			p2isright = true;
	 		}
	 		if (guessp3 == targetNumber){
	 			p3isright = true;
	 		}

	 		if (p1isright||p2isright||p3isright){
	 			System.out.println("We have a Winner!");
	 			System.out.println("Is first player right? Well ... that's statement is " + p1isright);
	 			System.out.println("Is second  player right? Well ... that's statement is " + p2isright);
	 			System.out.println("Is third player right? Well ... that's statement is " + p3isright);
	 			System.out.println("Game over. It took " + round + " rounds");
	 			break;

	 		}else{
	 			System.out.println("All guessed wrong! Let's do it again.");
	 		}
	 	}
	 }
}
class Player{
	int number = 0;
	public void guess(){
		number = (int)(Math.random()*999);

	}
}
public class GameLauncher{
	public static void main(String[] args){
		GuessGame game = new GuessGame();
		game.startGame();
	}
}
