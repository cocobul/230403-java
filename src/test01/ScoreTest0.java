package test01;

public class ScoreTest0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 100;
		
		if(score < 50) {
			System.out.println("첫번째 조건의 결과가 참입니다!!");
		} else if(score < 60){
			System.out.println("두번째 조건의 결과가 참입니다!!");
		} else if(score<70) {
			System.out.println("세번째 조건의 결과가 참입니다!!");
		} else if(score<90) {
			System.out.println("네번째 조건의 결과가 참입니다!!");
		} else {
			System.out.println("모든 조건의 결과가 거짓입니다!!");
		}
	}

}
