package ArrayList.arrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyArrayListTest {
    MyArrayList obj = new MyArrayList();  

	@Test
	void testMyArrayList() {
		MyArrayList myObject = new MyArrayList();
        assertNotNull(myObject, "Object should not be null");
	}

	@Test
	void testAdd() {
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		
        assertEquals(obj.get(0), 1); 
        assertEquals(obj.get(1), 2); 
        assertEquals(obj.get(2), 3); 
        assertEquals(obj.get(3), 4); 

	}

	@Test
	void testResize() {
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		
		assertEquals(obj.size(), 4);
		
		obj.add(5);
		assertEquals(obj.size(), 5);
		
	}
	@Test
	void testGet() {
		obj.add(0);
		obj.add(1);
		obj.add(2);
		obj.add(3);
        assertEquals(obj.get(2), 2); 

	}
	@Test
    void testGetIllegalArgumentException() {
		obj.add(0);
		obj.add(1);        
        assertThrowsExactly(IllegalArgumentException.class, () -> {
            obj.get(2); // Pass an invalid argument 
        });
	}

	@Test
void testRemove() {
    obj.add(1);
    obj.add(2);
    obj.add(3);
    obj.add(4);

	String expectedBackingArray = "[1, 2, 3, 4, 0, 0, 0, 0, 0, 0]";
    assertEquals(expectedBackingArray, obj.to(), "resized because 4 elements of a 5 length list. LF = .80");
    obj.remove(2);

    assertEquals(3, obj.size(), "Size should be reduced after removal");

    assertEquals(1, obj.get(0));
    assertEquals(2, obj.get(1));
    assertEquals(4, obj.get(2));

    String removed = "[1, 2, 4, 0, 0, 0, 0, 0, 0, 0]";
    assertEquals(removed, obj.to(), "array should be the same.");

	obj.add(5);
	String removed2 = "[1, 2, 4, 5, 0, 0, 0, 0, 0, 0]";
    assertEquals(removed2, obj.to(), "array should be the same.");

}


	@Test
	void testInvalidRemove() {
     
        assertThrowsExactly(IllegalArgumentException.class, () -> {
            obj.remove(0); // Pass an invalid argument 
        });
	}
	@Test
	void testSize() {
		obj.add(0);
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		assertEquals(obj.size(), 5);
	}

	@Test
	void testIsEmpty() {
		assertEquals(obj.isEmpty(), true);
	}

}
