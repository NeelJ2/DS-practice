package arraylistds;

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
        assertThrows(IllegalArgumentException.class, () -> {
            obj.get(2); // Pass an invalid argument 
        });
	}

	@Test
	void testRemove() {
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		
		obj.remove(3);
		
		assertEquals(obj.size(), 3);
		
	}
	@Test
	void testInvalidRemove() {
     
        assertThrows(IllegalArgumentException.class, () -> {
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
