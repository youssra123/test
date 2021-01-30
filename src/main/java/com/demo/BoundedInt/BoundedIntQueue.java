package com.demo.BoundedInt;

public interface BoundedIntQueue {

	int capacity();

	int size();

	void addLast(int i);

	void removeFirst();

	boolean isEmpty();

	boolean isFull();


}
