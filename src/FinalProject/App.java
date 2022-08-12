package FinalProject;

//2.)
public class App {

	
	public static void main(String[] args) {
//3.)
		Deck deckOfCards = new Deck(); 
		Player player1 = new Player();
		player1.setName("Jose");
		Player player2 = new Player();
		player2.setName("Joel");
//4.)		
		for(int i = 0; i <52; i++) {
			if(i % 2 ==0) {
				player1.draw(deckOfCards); 
			}else {
				player2.draw(deckOfCards); 
			}
		}
//5.)	
		for(int i = 0 ; i < 26; i++) {
			Card p1Card = player1.flip(); 
			Card p2Card = player2.flip(); 			
//6.)			
		if(p1Card.getValue()> p2Card.getValue()) {
			player1.incrmentScore();
		}else if(p2Card.getValue()> p1Card.getValue()) {
			player2.incrmentScore();
			}
		}
//7.)		
		System.out.println(player1.getName() + " your Score is:" + player1.getScore());
		System.out.println(player2.getName() + " your Score is:" + player2.getScore());
		if(player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " you're a winner baby!");
		}else if(player1.getScore() < player2.getScore()) {
			System.out.printf(player2.getName() + " you're a winner baby!");
		}else {
			System.out.printf("Ooo honey we got a draw!");
		}
	}
}
