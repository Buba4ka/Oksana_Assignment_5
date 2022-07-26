package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	
	int size =0;
	

	@Override
	public boolean add(T item) {
		
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
		items[size] = item;
		size ++;
		return true;
		
//		for (int i=0; i < items.length; i++) {
//			if (items[i] == null) {
//				items[i]=item;
//				return true;
//			} else if (items[i] != null && i == (items.length-1)){
//				
//				int length = items.length+10;
//			
//				this.items = Arrays.copyOf(items, length);
//				if (items[i] == null) {
//					items[i]=item;
//					return true;
//				  }
//				}
//				
//			}
//			return false;
	}

	@Override
	public int getSize() {
//		int size =0;
//		for (int i=0; i< items.length; i++) {
//			if (items[i] != null) {
//				size++;
//			}
//		}
		return size;
	}

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
//		for (int i=0; i< items.length; i++) {
//			if (i == index) {
//				return (T)items[index];
//			}
//		}
		if (index >= size || index <0) {
			throw new IndexOutOfBoundsException();
		}
		return (T)items[index];
		
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		
		for (int i=0; i< items.length; i++) {
			if (i == index) {
				
				for (int j= items.length-2; j>= i; j--) { //
					items[j+1] = items[j];
					
				}
				items[i] = item;
				size++;
				
				return true;
			} else if (index > size) {
				throw new IndexOutOfBoundsException();		
				
			}
		}
		return false;
		

	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		
		for (int i=0; i< items.length; i++) {
			if (i == index) {
				
				for (int j= i; j < items.length-1; j++) {
					items[j] = items[j+1];
				}
				size--;
			
			}else if (index > size){
				throw new IndexOutOfBoundsException();
			}
		}
		
		return (T)items[index];
	}
	
	
}
