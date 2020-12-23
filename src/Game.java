import java.util.*;

public class Game {

	private String[] colors = {"purple", "green", "orange"};
	private String[] shapes = {"squiggle", "oval", "diamond"};
	private String[] shadings = {"filled", "outlined", "blank"};
	private int[] numbers = {1, 2, 3};


	private ArrayList<Card> deck;
	
	private ArrayList<Card> table;
	
	public void createDeck() {

		deck = new ArrayList<>();

		for (int colorIndex = 0; colorIndex < 3; colorIndex++) {
			for (int shapeIndex = 0; shapeIndex < 3; shapeIndex++) {
				for (int shadingIndex = 0; shadingIndex < 3; shadingIndex++) {
					for (int numberIndex = 0; numberIndex < 3; numberIndex++) {
						deck.add(new Card(colors[colorIndex], shapes[shapeIndex],
								shadings[shadingIndex], numbers[numberIndex]));
					}
				}
			}
		}

		System.out.println(deck.size());
	}
	
	public void printDeck() {
		
		if (deck != null) {
			for (Card card : deck) {
				System.out.println(card);
			}
		}
	}
	
	public void startGame() {
		
	}
}
