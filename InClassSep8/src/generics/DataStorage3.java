package generics;

//An Array of Objects is always the same size, no matter what class they point to
//Primitive Array doesn't hold an address, but a value
//Null Value is an address with all 0's, a non valid memory location
//Garbage Collection reallocates memory if there is no reference to an memory address

//Generics enforces Type Checking

public class DataStorage3 <Type> {
	private Type item;
	private Type[] arrau = (Type[]) new Object[10];
//	private Type t;

	public Type getItem() {
		return item;
	}

	public void setItem(Type item) {
		this.item = item;
	}
	
	public static void main(String[] args) {
		DataStorage3<String> data = new DataStorage3<String>();
		data.setItem("Computer");
		String value = data.getItem();
		System.out.printf("%s\n", value);
	}
}
