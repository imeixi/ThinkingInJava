package cn.imexi.chapter7.java;

public class Detergent	extends Cleanser1{
	public void scrub(){
		append(" Detergent.scrub()");
		super.scrub();
	}
	
	public void foam(){
		append(" foam()");
	}
	
	public static void main(String[] args){
		Detergent d = new Detergent();
		d.dilute();
		d.apply();
		d.scrub();
		d.foam();
		System.out.println(d);
		System.out.println("Test base class:");
		Cleanser1.main(args);
	}
}


/* append 
 英 [ə'pend]   美 [ə'pɛnd] vt. 附加；贴上；盖章

 * dilute 
 英 [daɪ'l(j)uːt; dɪ-]   美 [daɪ'l(j)ut]  跟读 口语练习
adj. 稀释的；淡的
vt. 稀释；冲淡；削弱
vi. 变稀薄；变淡

 * apply   报错
 英 [ə'plaɪ]   美 [ə'plaɪ]  跟读 口语练习
vt. 申请；涂，敷；应用
vi. 申请；涂，敷；适用；请求

 * scrub   报错
 英 [skrʌb]   美 [skrʌb]  跟读 口语练习
n. 矮树；洗擦；擦洗者；矮小的人（或物）
vt. 用力擦洗；使净化
vi. 擦洗；进行手臂消毒
adj. 矮小的；临时凑合的；次等的

 * toString
 * 
 * Detergent   
 * 英 [dɪ'tɜːdʒ(ə)nt]   美 [dɪ'tɝdʒənt]  跟读 口语练习
n. 清洁剂；去垢剂

 * foam  
 英 [fəʊm]   美 [fom]  跟读 口语练习
n. 泡沫；水沫；灭火泡沫
vi. 起泡沫；吐白沫；起着泡沫流动
vt. 使起泡沫；使成泡沫状物
 */
