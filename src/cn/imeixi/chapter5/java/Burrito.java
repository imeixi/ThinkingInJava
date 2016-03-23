package cn.imeixi.chapter5.java;

public class Burrito {
	Spiciness degree;
	public Burrito(Spiciness degree){
		this.degree = degree;
	}
	public void describe(){
		System.out.print("This Burrito is ");
		switch(degree){
		case NOT: System.out.println("not spicy at all.");
				  break;
		case MILD:
		case MEDIUM: System.out.println("a little hot.");
					break;
		case HOT:
		case FLAMING:
		default: System.out.println("maybe too hot.");
		}
	}
	
	public static void main(String[] args) {
		Burrito 
			plain = new Burrito(Spiciness.HOT),
			greenChile = new Burrito(Spiciness.MEDIUM),
			jalapeno = new Burrito(Spiciness.NOT);
		
		plain.describe();
		greenChile.describe();
		jalapeno.describe();
			
	}
	
}


//Burrito [bə'rito] n 玉米煎饼
//Spiciness ['spaisinis] n 富于香料；辛辣
//degree [dɪ'griː]  n 程度，等级；度；学位；阶层
//spicy ['spaɪsɪ] adj 辛辣的；香的，多香料的；下流的

//plain [pleɪn]  
//n. 平原；无格式；朴实无华的东西
//adj. 平的；简单的；朴素的；清晰的
//adv. 清楚地；平易地
//n. (Plain)人名；(英)普莱恩；(法)普兰

//chile   
// 英 ['tʃili]  
//n. 红番椒，辣椒的一种；辣椒酱

//jalapeno   
//[ˌhɑːləˈpeɪnjoʊ]
//n. 墨西哥胡椒