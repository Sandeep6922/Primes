package com.ubs.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=10;
		
		new Math().evaluatePrime(number);
	}

	
	public Set evaluatePrime(int num) {
		
		Set<Integer> primesSet = new TreeSet<Integer>();
		
		for(int i=2;i<=num;i++) {
			
			primesSet.add(prime(i));		
		}
		
		primesSet.remove(0);
		return primesSet;
	}
	
	public int prime(int n) {
		
		int mod;
		int j=(n+1)/2;
		
		for(int i=2;i<=j;i++) {
		
			mod= n%i; 
			
			if(mod==0) {
			
			 return 0;
			}
			
		}
		
		return n;
	}
	
}
