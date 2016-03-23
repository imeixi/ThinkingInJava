package cn.imexi.chapter7.java;

public class Orc extends Villain {
	private int orcNumber;
	public Orc(String name,int orcNumber){
		super(name);
		this.orcNumber = orcNumber;		
	}
	
	public void change(String name,int orcNumber){
		setName(name);
		this.orcNumber = orcNumber;
	}
	
	public String toString(){
		return "orc: " + orcNumber + super.toString(); 
	}
	
	public static void main(String[] args) {
		Orc orc = new Orc("Villain",204);
		System.out.println(orc);
		orc.change("Villianm",205);
		System.out.println(orc);
	}
}

class Villain{
	private String name;
	protected void setName(String nm){ name = nm; }
	public Villain(String name){ this.name = name;}
	public String toString(){
		return " I am a Villain,and my name is " + name;
	}
}


/*
 villain   报错
 英 ['vɪlən]   美 ['vɪlən]  跟读 口语练习
n. 坏人，恶棍；戏剧、小说中的反派角色；顽童；罪犯

orc  
 英 [ɔːk]   美   
n. 虎鲸；乐队；妖魔（等于orca）
  
 
 */