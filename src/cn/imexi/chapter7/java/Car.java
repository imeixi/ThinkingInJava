package cn.imexi.chapter7.java;

public class Car {
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door
	 	left = new Door(),
	 	right = new Door();
	
	public Car(){
		for(int i =0;i < 4;i++){
			wheel[i] = new Wheel();
		}
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
	}
	
}

class Engine{   // 
	public void start(){}
	public void rev(){}  //
	public void stop(){}
}

class Window{
	public void rollup(){}
	public void rolldown(){}
}

class Wheel{
	public void inflate(int psi){}
}

class Door{
	public Window window = new Window();
	public void open(){}
	public void close(){}
}




/*
	rev  
	英 [rev]   美 [rɛv]
	n. 发动机的旋转
	vt. 使加速；增加
	vi. 加快转速；增长

	engine   
	英 ['endʒɪn]   美 ['ɛndʒɪn]  
	n. 引擎，发动机；机车，火车头；工具
	
	rollup
	n. 归纳；卷曲；袅袅上升
	
	roll down ： 滚下
	
	inflate  
	 英 [ɪn'fleɪt]   美 [ɪn'flet] 
	vt. 使充气；使通货膨胀
	vi. 膨胀；充气
	
*/