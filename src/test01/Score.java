package test01;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����� ������ �Է��ϼ���: ");
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		if(score >= 80) {
			System.out.println("����� ��� �Դϴ�!");
		} else if(score >= 60) {
			System.out.println("����� ���� �Դϴ�!");
		} else if(score >=40) {
			System.out.println("����� �̴� �Դϴ�!");
		} else {
			System.out.println("����� ���� �Դϴ�!");
		}
		scanner.close();
	}

}
