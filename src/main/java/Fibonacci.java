package main.java;

import java.math.BigInteger;

public class Fibonacci {
	
	public static BigInteger fib(BigInteger n) {
	   
		long ln = n.longValue();
		
		if(ln < 0) {
			System.out.println("n < 0");
			return null;
		}
		
		if(ln < 2 )
			return n;
		
		BigInteger last = BigInteger.valueOf(0), 
				   next = BigInteger.valueOf(1), last0 ;	
		
		Long t1 = System.currentTimeMillis();
			
		for( long i = 1; i <= ln-1; i++) {
			last0 = last;
			last = next;
			next = next.add(last0);
		} 
			
		Long t2 = System.currentTimeMillis() - t1;
			
		System.out.println("for " + n.toString() + " " + t2.toString() + " ms");
		
		return next;
	 } 
	
} 
