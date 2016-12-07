package cn.imeixi.chapter21.exer;

import java.util.Arrays;

public class Exer2Fibonacci {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10 ; i++) {
			new Thread(new Fibonacci1(i)).start();
//			new Fibonacci(i).run();
		}
		
	}
	
}

class Fibonacci1 implements Runnable{

	private int n=1;
	
	private int[] fib;
	
	
	public Fibonacci1(int n){
		this.n = n;
		fib = new int[n];
	}
	
	public void run() {
		if(n < 1){
			System.out.println(" n must be bigger than one");
		}else if(n < 2){
			fib[0] = 1;
		}else if(n < 3){
			fib[0] = 1;
			fib[1] = 1;
		}else{
			fib[0] = 1;
			fib[1] = 1;
			for(int i = 2;i < n;i++){
				fib[i] = fib[i-1] + fib[i-2];
			}
		}
		
		System.out.println(Arrays.toString(fib));
	}
	
}
