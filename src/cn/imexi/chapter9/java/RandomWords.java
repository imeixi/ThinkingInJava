package cn.imexi.chapter9.java;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.*;

public class RandomWords implements Readable{

	private static Random rand = new Random(47);
	private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowercase = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels = "aeiou".toCharArray();
	private int count;
	
	public RandomWords(int count){
		this.count = count;
	}
	
	public int read(CharBuffer cb) throws IOException {
		if(count-- == 0){
			return -1;
		}
		
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for(int i = 0;i < 4;i++){
			cb.append(lowercase[rand.nextInt(lowercase.length)]);
		
			cb.append(vowels[rand.nextInt(vowels.length)]);			
		}
		cb.append(" ");
		return 0;
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(new RandomWords(20));
		while(s.hasNext()){
			System.out.println(s.next());
		}
	}

}

//capitals ['kæpətl]  n. 首都；资产（capital的复数）；大写字母
//lowercase  苿 [,ləʊə'keɪs]   羿 ['loɚ,kes]  n. 小写字母；小写字使  adj. 小写字体皿   vt. 用小写字体书冿
//vowels  羿 ['vaʊəl]   n. [语] 元音，母音（vowel的复数形式）

