package cn.imeixi.chapter3.java;

//Assignment(分配；任务；作业；功课) with objects is （a bit tricky 有点棘手）【tricky adj.狡猾的；机警的】.
//对象的赋值别名
import static net.mindview.util.Print.*;

class Tank{
	int level;
}

public class AssignmentP40 {
	public static void main(String[] args){
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		print("1: t1.level: " + t1.level + " t2.level: " + t2.level);
		t1 = t2;
		print("2: t1.level: " + t1.level + " t2.level: " + t2.level);
		t1.level = 27;
		print("3: t1.level: " + t1.level + " t2.level: " + t2.level);

	}
}
