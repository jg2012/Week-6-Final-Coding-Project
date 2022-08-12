package FinalProject;

public class Card {
//1a.) 	
	private int value; 
	private String name;
	

	public Card(int value, String name) {
		this.value = value; 
		this.name = name; 
	}

//i.)
	public int getValue() {
		return this.value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	} 
//ii.)	
	public void describe() {
		System.out.println("This is your card" + name + " which has a value of " + value +"."); 
	}

}
