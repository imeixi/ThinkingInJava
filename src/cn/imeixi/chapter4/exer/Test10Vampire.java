package cn.imeixi.chapter4.exer;

public class Test10Vampire {
	public static void main(String[] args) {
		int from,to,t=0;
		for(int i = 1000;i < 10000;i++){
			if(i % 100 == 0) continue;
			isVampire(i);			
		}
		
	      from = Math.max(1000 / t, t + 1);  
	      to = Math.min(10000 / t, 100);  
//		isVampire(1729);
	}
	
	static void isVampire(int k){
		int m,n1,n2;
		int[] num = new int[4];
		num[0] = k / 1000;
		num[1] = k / 100 % 10;
		num[2] = k / 10 % 10;
		num[3] = k % 10;
		
		for(int i = 0;i < 2;i++){
			for(int j = 0;j < num.length;j++){
				if(j == i) continue;
				m = num[i] * 10 + num[j];
				if(i + j == 3){
					if(i == 0){
						n1 = num[1] * 10 + num[2];
						n2 = num[2] * 10 + num[1];						
					}else{
						n1 = num[0] * 10 + num[3];
						n2 = num[3] * 10 + num[0];						
					}

				}else{
					n1 = num[4 - i - 1] * 10 + num[4 - j - 1];
					n2 = num[4 - i - 1] * 10 + num[4 - j - 1];
				}
				if(k == m * n1 || k == m * n2 ){
					System.out.println("k = "+ k + " m = " + m + " n = " + k/m);		
					return;
				}
			}
			
		}

	}
		
		
}
	

