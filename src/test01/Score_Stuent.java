package test01;

import java.util.Scanner;

public class Score_Stuent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.print("당신의 성적을 입력하세요: ");
		
		int score=scanner.nextInt();
		
		if (score >=90) {
			grade='수';
		} else if (score >=80) {
			grade='우';
		} else if (score >=70) {
			grade='미';
		} else if (score >=60) {
			grade='양';
		} else {
			grade='가';
		}
		
		System.out.println("당신의 성적은 "+ grade +" 입니다.");
		
		scanner.close();
		
		
	}

}
