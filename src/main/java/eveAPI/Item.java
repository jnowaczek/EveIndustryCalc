package eveAPI;

public class Item {
	public final int typeID;
	public final int quantity;
	public final double probability;

	public Item(int typeID, int quantity) {
		this.typeID = typeID;
		this.quantity = quantity;
		this.probability = 1;
	}

	public Item(int typeID, int quantity, double probability) {
		this.typeID = typeID;
		this.quantity = quantity;
		this.probability = probability;
	}
}
