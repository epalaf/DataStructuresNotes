package generics;

//An Array of Objects is always the same size, no matter what class they point to
//Primitive Array doesn't hold an address, but a value

public class DataStorage2 {
	private Object item;
	private Object[] array = new Object[10];

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	
	public static void main(String[] args) {
		DataStorage2 data = new DataStorage2();
		data.setItem("Computer");
		String value = (String) (data.getItem());
		System.out.printf("%s\n", value);
	}
}
