package cn.imeixi.chapter5.java;

public class MethodInit {
	int i = f();     //��ʼ��1
	int j = g(i);		//��ʼ��2
	int f(){return 11;}  //��������
	int g(int n){return n * 10;}   //��������
}

//��ʼ�� ˳�����Ҫ--���϶��¡�
//�������� λ�ÿ����⡣���ϰ�ߣ���ʼ���������ϣ������������¡�
