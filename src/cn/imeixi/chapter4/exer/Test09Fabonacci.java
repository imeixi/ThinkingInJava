package cn.imeixi.chapter4.exer;

public class Test09Fabonacci {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for(int i = 0;i < n;i++){
			System.out.print(fib(i) + " ");
		}
	}
	
	static int fib(int n){
		if(n <= 2){
			return 1;
		}else{
			return fib(n-1) + fib(n-2);
		}
	}

}
