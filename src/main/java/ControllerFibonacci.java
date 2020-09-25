package main.java;

import java.math.BigInteger;

public class ControllerFibonacci {

	public static void main(String[] args) {
		
		System.out.println("Fibonacci: ");
		System.out.println("");
		
		BigInteger a = Fibonacci.fib(BigInteger.valueOf(15));
		System.out.println("Fibonacci 15: " + a);
		
		BigInteger b = Fibonacci.fib(BigInteger.valueOf(100));
		System.out.println("Fibonacci 100: " + b);
		
		System.out.println("Fibonacci 2_000_000: ");
		BigInteger c = Fibonacci.fib(BigInteger.valueOf(2_000_000));
		
		if(c != null) {
			String[] cFib = c.toString().split(""); 
			long counter = 0;
			for(String cf: cFib) {
				System.out.print(cf);
				counter++;
				if(counter > 0 && counter%150 == 0)
					System.out.println();
			}			
		}
	}
}
