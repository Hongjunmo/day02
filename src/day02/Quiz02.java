package day02;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("당신의 이름은 무엇입니까? : ");
		String name = scan.next();

		System.out.println("국어점수 입력:");
		int kor = scan.nextInt();
		System.out.println("영어점수 입력:");
		int eng = scan.nextInt();
		System.out.println("수학점수 입력:");
		int math = scan.nextInt();
		int total = kor + eng + math;

		System.out.println("=================");
		System.out.println("이름 : " + name);
		System.out.println("=================");
		System.out.println(name + "님의 국어점수:" + kor);
		System.out.println(name + "님의 국어점수:" + eng);
		System.out.println(name + "님의 국어점수:" + math);
		System.out.println("=================");
		System.out.println("합계 : " + total);
		System.out.println("=================");



	}
}
