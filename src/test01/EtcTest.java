package test01;

import java.util.Scanner;

public class EtcTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����� ���̴� ���Դϱ�?");
		Scanner scanner = new Scanner(System.in);
		//scanner ��ü�� �����
		
		int student_age = scanner.nextInt();
		
		if(student_age >=20) {
			System.out.println("����� �����̽ñ���!");
		} else {
			System.out.println("����� �̼����̽ñ���!");
		}
		
		System.out.println("����� ���̴� " +student_age+ "�� �Դϴ�.");
		
		scanner.close();
	}
}
