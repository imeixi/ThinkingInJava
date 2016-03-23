package cn.imeixi.chapter3.java;

//Demonstrates( 证明；展示；论证) the mathematical operators
import java.util.*;
import static net.mindview.util.Print.*;
public class MathOpsP41 {
	public static void main(String[] args){
		//create a seeded random number generator:
		Random rand = new Random(47);  //创建种子，不填的话，默认使用当前时间
		int i,j,k;
		//choose value from 1 to 100
		j = rand.nextInt(100) + 1;
		print("j: " + j);
		k = rand.nextInt(100) + 1;
		print("k: " + k);
		i = j + k;
		print("j + k : " + i);
		i = j - k;
		print("j - k : " + i);
		i = j * k;
		print("j * k : " + i);
		i = j / k;
		print("j / k : " + i);
		i = j % k;
		print("j % k : " + i);
		j %= k;
		print("j %= k : " + i);
		
		//Floating-point number tests:
		float u,v,w; //Applies to doubles,too
		v = rand.nextFloat();
		print("v: " + v);
		w = rand.nextFloat();
		print("w: " + w);
		u = v + w;
		print("v + w: " + u);
		u = v - w;
		print("v - w: " + u);
		u = v * w;
		print("v * w: " + u);
		u = v / w;
		print("v / w: " + u);

		//The following also works for char
		//byte,short,int,long,double
		u += v;
		print("u += v:" + u);		
		u -= v;
		print("u -= v:" + u);		
		u *= v;
		print("u *= v:" + u);		
		u /= v;
		print("u /= v:" + u);		
		u %= v;
		print("u %= v:" + u);		
			
	}
}
