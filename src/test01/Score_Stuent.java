package test01;

import java.util.Scanner;

public class Score_Stuent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.print("����� ������ �Է��ϼ���: ");
		
		int score=scanner.nextInt();
		
		if (score >=90) {
			grade='��';
		} else if (score >=80) {
			grade='��';
		} else if (score >=70) {
			grade='��';
		} else if (score >=60) {
			grade='��';
		} else {
			grade='��';
		}
		
		System.out.println("����� ������ "+ grade +" �Դϴ�.");
		
		scanner.close();
		
		
	}

}
