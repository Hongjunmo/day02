package day02;

public class Quiz01 {
	public static void main(String[] args) {

		byte b = 97;
		short s = 20;
		char c = 'A';
		float f;
		s = b;
		c = (char) b;
		s = (short) c;
		c = (char) s;
		f = 5.11f; // ��ǻ�Ͱ� 8byte�� �ν��ؼ� float ĳ����

		System.out.println("b:" + b + "\ns:" + s + "\nc:" + c + "\nf:" + f);

	}
}
