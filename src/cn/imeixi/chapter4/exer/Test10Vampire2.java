package cn.imeixi.chapter4.exer;

import sun.tools.jar.Main;

public class Test10Vampire2 {
	public static void main(String[] args) {
		int num1;
		int num2;
		int product;
		int count;
		int sum = 0;
		int startval[] = new int[4];
		int productval[] = new int[4];
		
		for(num1 = 10;num1 < 100;num1++){
			for(num2 = num1;num2 < 100;num2++){
				product = num1 * num2;
				if(product % 9 != (num1 + num2) % 9 || product % 100 == 0){
					continue;
				}
				sum++;
				startval[0] = num1 / 10;
				startval[1] = num1 % 10;
				startval[2] = num2 / 10;
				startval[3] = num2 % 10;
				productval[0] = product / 1000;
				productval[1] = product / 100 % 10;
				productval[2] = product / 10 % 10;
				productval[3] = product % 10;
				count = 0;
				for(int x = 0;x < 4;x++){
					int tmp = count;
					for(int y = 0;y < 4;y++){
						if(startval[x] == productval[y]){
							count++;
							startval[x] = -1;
							productval[y] = -2;
						}

					}
					if(count - tmp == 0) break;
				}
				if(count == 4){
					System.out.println(product + " = " + num1 + "*" +num2);
				}
				
			}
			
		}
		System.out.println("sum = " + sum );
	}
}
