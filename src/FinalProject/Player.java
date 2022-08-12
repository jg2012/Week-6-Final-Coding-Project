package FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
//1c.)	
	private List<Card> hand = new ArrayList<Card>();
	private int score = 0; 
	private String name; 

//i.)
	public void  describe() {
		System.out.println("Hello" + name + " your score is: " + score);
		if(hand.size()>0) {
		for(Card c : hand) {
			c.describe(); 
		}
		}
	}
	
	
//ii.)	
	public void draw(Deck cardDeck) {
		hand.add(cardDeck.draw());
	}
	
	public void incrmentScore() {
		score++; 
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public String getName() {
		return name; 
	}
	
	public int getScore() {
		return score;
	}
	
	
}
