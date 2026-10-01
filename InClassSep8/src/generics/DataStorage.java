package generics;

//An Array of Objects is always the same size, no matter what class they point to
//Primitive Array doesn't hold an address, but a value

public class DataStorage {
	private String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	public static void main(String[] args) {
		DataStorage data = new DataStorage();
		data.setItem("Computer");
		String value = data.getItem();
		System.out.printf("%s\n", value);
	}
}
