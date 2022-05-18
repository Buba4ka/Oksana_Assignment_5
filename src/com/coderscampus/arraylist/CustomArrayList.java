package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	

	@Override
	public boolean add(T item) {
		
		for (int i=0; i < items.length; i++) {
			if (items[i] == null) {
				items[i]=item;
				return true;
			} else if (items[i] != null && i == (items.length-1)){
				
				int length = items.length+10;
			
				this.items = Arrays.copyOf(items, length);
				if (items[i] == null) {
					items[i]=item;
					return true;
				  }
				}
				
			}
			return false;
	}

	@Override
	public int getSize() {
		int size =0;
		for (int i=0; i< items.length; i++) {
			if (items[i] != null) {
				size++;
			}
		}
		return size;
	}

	@Override
	public T get(int index) {
		for (int i=0; i< items.length; i++) {
			if (i == index) {
				return (T)items[index];
			}
		}
		return null;
	}
	
}
