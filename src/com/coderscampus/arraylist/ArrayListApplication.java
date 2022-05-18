package com.coderscampus.arraylist;

public class ArrayListApplication {

	public static void main(String[] args) {
		
		CustomList<Integer> items = new CustomArrayList<>();
		
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);
		items.add(5);
		items.add(6);
		items.add(7);
		items.add(8);
		items.add(9);
		items.add(10);
		items.add(11);
		items.add(12);
		items.add(13);
		items.add(14);
		items.add(15);
		items.add(16);
		items.add(17);
		items.add(18);
		items.add(19);
		items.add(20);
		items.add(21);
			

		
		for (int i=0; i< items.getSize(); i++) {
			System.out.println(items.get(i));
			
		}
		
		
		
		

	}

}
