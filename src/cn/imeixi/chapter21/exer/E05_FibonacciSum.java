package cn.imeixi.chapter21.exer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.omg.PortableServer.ForwardRequest;

import net.mindview.util.Generator;

public class E05_FibonacciSum {

	public static void main(String[] args) {
		
		ExecutorService exService = Executors.newCachedThreadPool();
		List<Future<Integer>> results = new ArrayList<Future<Integer>>();
		for(int i = 0; i < 10; i++){
			results.add(exService.submit(new FibonacciSum(i)));
		}
		Thread.yield();
		exService.shutdown();
		
		for (Future<Integer> future : results) {
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				exService.shutdown();
			}
		}
	}
}

class FibonacciSum implements Generator<Integer>,Callable{

	private int count;
	private final int n;
	public FibonacciSum(int n){
		this.n = n;
	}
	public Integer next() {
		return fib(count++);
	}
	public int fib(int n){
		return n < 2 ? 1 : fib(n-1) + fib(n-2);
	}
	
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += next();
		}
		return sum;
	}

	
}