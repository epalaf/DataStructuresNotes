
public class ArrayList<Type> {
	private Object[] array;
	private int used;
	private Type t;

	ArrayList() {
		this.array = new Object[10];
		this.used = 0;
	}

	ArrayList(int size) {
		if (size < 0) {
			size = 10;
		}
		this.array = new Object[size];
		this.used = 0;
	}

	public int size() {
		return this.used;
	}

	public void Add(Type element) {
		Object[] box = new Object[used + 1];
		for (int i = 0; i < used; i++) {
			box[i] = array[i];
		}
		box[used + 1] = element;
		this.array = box;
	}

	public Type get(int index) {
		if (index < 0 || index >= this.used) {
			throw new OutOfBoundsException("Index: " + index + ",Size: " + this.used);
		}
		return (Type) this.array[index];
	}

}
