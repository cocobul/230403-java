package test01;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("����� �̸��� �Է��ϼ���:");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		
		System.out.println("����� �̸���" + name + "�Դϴ�.");
		
		System.out.println("����� ���̸� �Է��ϼ���:");
		
		int age = scanner.nextInt();
		
		System.out.println(name + "���� ���̴�" + age + "�Դϴ�.");
		
		System.out.println("����� Ű�� �����Ը� �Է��ϼ���:");
		
		double height = scanner.nextDouble();
		double weight = scanner.nextDouble();
		
		System.out.println("Ű:" + height + "cm");
		System.out.println("������:" + weight + "kg");
			
		scanner.close();
	}

}
