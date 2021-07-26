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
		f = 5.11f; // 컴퓨터가 8byte로 인식해서 float 캐스팅

		System.out.println("b:" + b + "\ns:" + s + "\nc:" + c + "\nf:" + f);

	}
}
