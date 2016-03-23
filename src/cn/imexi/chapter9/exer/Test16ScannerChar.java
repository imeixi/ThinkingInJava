package cn.imexi.chapter9.exer;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class Test16ScannerChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(new ScannerChar(10));
		while(scan.hasNext()){
			System.out.println(scan.next());
		}
	}

}

class ScannerChar implements Readable{

	private static final char[] str = "abcedfghijklmn".toCharArray();	
	private int counter;
	
	public ScannerChar(int counter){
		this.counter = counter;
	}
	
	Random rand = new Random(47);
	
	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		if(counter-- < 0){
			return -1;
		}
		for(int i = 0;i < 5;i++){
			cb.append(str[rand.nextInt(str.length)]);
		}
		cb.append("M");
		cb.append("\n");
		return 0;
	}
	
}
