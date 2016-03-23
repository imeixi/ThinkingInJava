package cn.imeixi.chapter4.exer;

public class Test05PrintBinary {
	public static void main(String[] args) {
		int a = 0xaaaaaaaa;
		int b = 0x55555555;
		System.out.print(" a = ");printBinary(a);
		System.out.print(" b = ");printBinary(b);
		System.out.print("~a = ");printBinary(~a);
		System.out.print("~b = ");printBinary(~b);
		System.out.print("a | a = ");printBinary(a | a);
		System.out.print("a & a = ");printBinary(a & a);
		System.out.print("a ^ a = ");printBinary(a ^ a);
		System.out.print("a | b = ");printBinary(a | b);
		System.out.print("a & b = ");printBinary(a & b);
		System.out.print("a ^ b = ");printBinary(a ^ b);
	
	}
	
//��ʽ����ȡ���λ���޷��Ű�λ����1λ���������飬��ӡ�����λ�����λ
		static void printBinary(int num) {
			//��λ���浽����
			char[] buffer = new char[32];
			int bufferPosition = 32;
			do{
				buffer[--bufferPosition] = (num & 0x01) != 0 ? '1' : '0';
				num >>>= 1;
			}while( num != 0);	
			//��ӡ����
			for (int j = bufferPosition; j < 32; j++) {
				System.out.print(buffer[j]);
			}
			System.out.println();
		}

//��ʽ������ӡ���λ����λ����1λ��
/*
	static void printBinary(int num) {
		for (int i = 0; i < 32; i++) {
			if ((num & 0x80000000) != 0) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
			num <<= 1;
		}
		System.out.println();
	}
*/
}
