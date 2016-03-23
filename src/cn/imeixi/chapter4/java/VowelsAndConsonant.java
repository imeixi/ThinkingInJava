package cn.imeixi.chapter4.java;

import static net.mindview.util.Print.*;

import java.util.Random;
public class VowelsAndConsonant {
	public static void main(String[] args) {
		int i = 0;
		Random rand = new Random(47);
		while(i < 100){
			int x = rand.nextInt(26) + 'a';
			printnb((char)x + "," + x + " ");
			switch(x){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': print("is vowel.");break;
				case 'y':
				case 'n': print("Sometimes is vowel.");break;
				default: print("is consonant");	
			
			}
			i++;
		}
		
	}
}
