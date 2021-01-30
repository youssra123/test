package com.demo.tdd.services;

import com.demo.tdd.exception.InvalidListException;

public class NumberService {

	public int biggestNumber(int[] list) {
		if(list==null)throw new InvalidListException("la liste n'existe pas");
		int max=list[0];
	for (int i = 0; i < list.length; i++) {
		if(list[i]>max)max=list[i];
	}
	return max;
	}

}
