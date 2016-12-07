package cn.imeixi.chapter21.exer;

import java.util.Arrays;
import net.mindview.util.Generator;

public class E02_Fibonacci {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new Fibonacci(i)).start();
		}
	}
}

class Fibonacci implements Generator<Integer>,Runnable{

	private int count;
	private final int n;
	public Fibonacci(int n){
		this.n = n;
	}
	private int fib(int n){
		return n < 2 ? 1 : fib(n-1) + fib(n-2);
	}
	
//	Fibonacci序列实现方式二
//	private int fib(int N) {
//	      int lo = 0;
//	      int hi = 1;
//	      for (int i = 0; i < N; i++) {
//	          hi = lo + hi;
//	          lo = hi - lo;
//	      }
//	      return lo;
//	  }
	
	public Integer next() {
		return fib(count++);
	}
	
	public void run() {
		Integer[] sequence = new Integer[n];
		for (int i = 0; i < sequence.length; i++) {
			sequence[i] = next();
			Thread.yield();
		}
		System.out.println("Seq.of " + n + ":" + Arrays.toString(sequence));
	}

	
}