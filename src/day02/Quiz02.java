package day02;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("����� �̸��� �����Դϱ�? : ");
		String name = scan.next();

		System.out.println("�������� �Է�:");
		int kor = scan.nextInt();
		System.out.println("�������� �Է�:");
		int eng = scan.nextInt();
		System.out.println("�������� �Է�:");
		int math = scan.nextInt();
		int total = kor + eng + math;

		System.out.println("=================");
		System.out.println("�̸� : " + name);
		System.out.println("=================");
		System.out.println(name + "���� ��������:" + kor);
		System.out.println(name + "���� ��������:" + eng);
		System.out.println(name + "���� ��������:" + math);
		System.out.println("=================");
		System.out.println("�հ� : " + total);
		System.out.println("=================");



	}
}
