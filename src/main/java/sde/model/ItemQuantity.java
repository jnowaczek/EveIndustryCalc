package sde.model;

public class ItemQuantity {
	private final int typeID;
	private final int quantity;

	public ItemQuantity(int typeID, int quantity) {
		this.typeID = typeID;
		this.quantity = quantity;
	}

	public int getTypeID() {
		return typeID;
	}

	public int getQuantity() {
		return quantity;
	}
}
