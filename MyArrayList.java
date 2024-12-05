package ArrayList.arrayList;

public class MyArrayList {

	// Attributes
	private int[] arrayList = new int[5];
	private int index = 0;
	private int numberElements = 0;
	private int capacity = arrayList.length;

	// Constructor
	public MyArrayList() {
		this.arrayList = new int[5];
		this.numberElements = 0;
		this.capacity = arrayList.length;
	}

	public void resize() {
		int[] newList = new int[this.arrayList.length * 2];
		for (int i = 0; i < arrayList.length; i++) {
			newList[i] = arrayList[i];
		}
		this.arrayList = newList;
		this.capacity = arrayList.length;
	}

	// Add an element to the end of the list
	public void add(int element) {
		this.arrayList[this.index] = element;
		this.index++;
		this.numberElements++;
		
		double loadFactor = (double) this.numberElements / (double) this.capacity;
		if (loadFactor >= .75) {
			resize();
		}
	}

	// Get an element at a specific index
	public int get(int index) {
	        if (index < 0 || index > numberElements - 1) {
	            throw new IllegalArgumentException("Cannot get this number at this index.");
	        }
	        return this.arrayList[index];
	    } 
		

	// Remove an element at a specific index
	public void remove(int index) {
        if (index < 0 || index > numberElements - 1) {
            throw new IllegalArgumentException("Cannot remove this number at this index.");
        }
		while (index < this.numberElements) {
			this.arrayList[index] = this.arrayList[index + 1];
			index += 1;
		}
		this.index--;
		this.numberElements--;
	}

	// Return the number of elements in the list
	public int size() {
		return this.numberElements;
	}

	// Check if the list is empty
	public boolean isEmpty() {
		return this.numberElements > 0 ? false : true;
	}

	public String to() {
		return java.util.Arrays.toString(this.arrayList);

	}
}