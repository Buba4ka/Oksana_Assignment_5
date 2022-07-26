package com.coderscampus.arraylist;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.rules.ExpectedException;


public class CustomArrayListTest {
	
	@Test
	void should_add_one_item_to_list() {
		
		CustomList <Integer>customList = new CustomArrayList<>();
		
		
		customList.add(10);
		Integer expectedResult = customList.get(0);
		Integer expectedSize = customList.getSize();

		assertEquals(10, expectedResult);
		assertEquals(1, expectedSize);
		
	}
	
	
	
	@Test
	void should_add_item_at_index () {
		
CustomList <Integer>customList = new CustomArrayList<>();
		
		
		customList.add(0,10);
		customList.add(1,9);
		customList.add(2,8);
		
		customList.add(0,2);
		assertEquals(4, customList.getSize());
		
		assertEquals(2, customList.get(0));
							
	}
	
	@Test
	void should_remove_item_at_index () {
CustomList <Integer>customList = new CustomArrayList<>();
		
		
		customList.add(0,10);
		customList.add(1,9);
		customList.add(2,8);
		customList.add(0,2);
		
		customList.remove(2);
		assertEquals(3, customList.getSize());
		assertEquals(8,customList.get(2));
		
	}

	
	
	@Test
	void should_add_9_items_to_list () {
	
			CustomList<Integer> sut = new CustomArrayList();	
		
			sut.add(1); sut.add(2); sut.add(3);
			sut.add(4); sut.add(5); sut.add(6);
			sut.add(7); sut.add(8); sut.add(9);
			
		
		
			for (int i=0; i< 8; i++) {
				assertEquals(i+1, sut.get(i));
				
			}
			assertEquals(1,sut.get(0));
			
			assertEquals(9, sut.getSize());
				
	}
	
	@Test
	void assert_item_at_index_is_added () {
		
		
		CustomList <Integer>sut = new CustomArrayList<>();
		sut.add(1); sut.add(2); sut.add(3);
		boolean sutHasElement;
		if ((sut.getSize() > 0 && null != sut )) {
			sutHasElement = true;
		}else {
			sutHasElement = false;
		}

		assertEquals(true, sutHasElement);
		
//		sut.remove(0);
//		sut.remove(1);
//		sut.remove(2);
//		
//		assertEquals(false, sutHasElement);
					
	}
	
	@Test
	void assert_exception_is_thrown () {
		CustomList <Integer>sut = new CustomArrayList<>();
		sut.add(1); sut.add(2); sut.add(3);
	

		try {
			sut.add(10, 1);
			//sut.get(10);
			fail("Fail");
		}
		catch (Exception e) {
			System.out.println("It worked");
		}
		
		
	}
	
	@Test
	void assert_exception_is_thrown_during_removal() {
		
		CustomList <Integer>sut = new CustomArrayList<>();
		sut.add(1); sut.add(2); sut.add(3);
		
		try {
			sut.remove(5);
			fail("Fail");
		}catch (Exception e) {
			System.out.println("It worked");
		}
		
		
	}



}
