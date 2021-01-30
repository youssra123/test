package com.demo.BoundedInt;

import com.demo.tdd.exception.InvalidListException;

public class BoundedIntQueueBuggy implements BoundedIntQueue {
	private int tab[];
	private int capacity;
	private int size;

	public  BoundedIntQueueBuggy(int capacity) {
	 this.tab=new int[capacity];
	 this.capacity=capacity;
		this.size=0;
	}

	@Override
	public int capacity() {
		
		return this.capacity;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public void addLast(int i) {
		if(this.isFull()) throw new IllegalStateException("la liste est plien je peux pas ajouter");
		else {
		this.tab[size()]=i;
		this.capacity=this.capacity-1;
		this.size=this.size+1;
		}
		
	}

	@Override
	public void removeFirst() {
		if(isEmpty()) throw new IllegalStateException("la liste est vide je peux pas supprimer");
		else {
		for (int i = 0; i < this.size()+this.capacity; i++) {
			
			this.tab[i]=this.tab[i+1];
			
		}
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(this.size==0) return true;
		return false;
	}

	@Override
	public boolean isFull() {
	if(this.capacity==0) return true;
		return false;
	}

}
