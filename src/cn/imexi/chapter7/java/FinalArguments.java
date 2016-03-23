package cn.imexi.chapter7.java;

public class FinalArguments {
	void with(final Gizmo g){
	//	g = new Gizmo(); final g can not be change
	}
	
	void without(Gizmo g){
		g = new Gizmo();
	}
	
//	void f(final int i){ i++;}
	int g(final int i){return i+1;}
	
	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		bf.with(null);
		bf.without(null);
	}
}

class Gizmo{
	public void spin(){}
}


//Gizmo: 英 ['gɪzməʊ]   美 ['ɡɪzmo] n. 小发明（等于gismo ）
/*
spin  英 [spɪn]   美 [spɪn]
vi. 旋转；纺纱；吐丝；晕眩
vt. 使旋转；纺纱；编造；结网
n. 旋转；疾驰
 */