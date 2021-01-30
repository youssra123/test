package com.demo.BoundedInt;

import com.demo.tdd.exception.InvalidListException;

public class BoundedIntQueueFast implements BoundedIntQueue {

	private int headPos=5;
	private int tab[];
	private int capacity=0;
	private int size;
	
	public BoundedIntQueueFast(int capacity) {
		this.capacity=capacity;
		this.tab=new int [capacity+headPos];
		this.size=0;
		
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
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
		this.tab[size()+this.headPos-1]=i;
		this.capacity=this.capacity-1;
		this.size=size+1;
		}
		
	}

	@Override
	public void removeFirst() {
		if(isEmpty()) throw new IllegalStateException("la liste est vide je peux pas supprimer");
		else {
		this.headPos=this.headPos+1;
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
