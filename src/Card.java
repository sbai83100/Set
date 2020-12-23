
public class Card {

	private String color;
	private String shape;
	private String shading;
	private int number;
	
	public Card(String color, String shape, String shading, int number) {
		this.color = color;
		this.shape = shape;
		this.shading = shading;
		this.number = number;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getShape() {
		return shape;
	}
	
	public String getShading() {
		return shading;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String toString() {
		return color + " | " + shape + " | " + shading + " | " + number;
	}
}
