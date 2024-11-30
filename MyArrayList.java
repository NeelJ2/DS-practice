package arraylistds;

public class MyArrayList {

	// Attributes
	private int[] arrayList = new int[5];
	private int index = 0;
	private int numberElements = 0;
	private int capacity = arrayList.length;

	// Constructor
	public MyArrayList() {

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
		int counter = 0;

		int[] newList = new int[this.arrayList.length - 1];
		while (counter != index) {
			newList[counter] = this.arrayList[counter];
			counter += 1;
		}
		counter += 1;
		while (counter < this.arrayList.length - 1) {
			newList[counter] = this.arrayList[counter];
			counter += 1;
		}

		this.arrayList = newList;
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