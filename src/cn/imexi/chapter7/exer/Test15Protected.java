package cn.imexi.chapter7.exer;

public class Test15Protected extends Protected{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Test15Protected p = new Test15Protected();
		p.setName("Jerry");
		System.out.println(p);
		p.setAge(32);
		System.out.println("Hi " + p.getName() + ",you are " + p.getAge() + " years old.");
	}
}


class Protected{
	private String name;	
	protected void setName(String name){ this.name = name;}
	protected String getName(){ return name;}
	public Protected(){
		System.out.println("This is Constructor.");
	}
	
	public String toString(){
		return name + ",You are to poor.";
	}
	
}

