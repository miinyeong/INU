import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
		char Grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = sc.nextInt();
		if(score>=90 && score<=100) {
			Grade = 'A';
		}else if(score>= 80) {
			Grade = 'B';
		}else if(score>= 70) {
			Grade = 'C';
		}else if(score>= 60) {
			Grade = 'D';
		}else {
			Grade='F';
		}
		System.out.println("학점은 "+Grade+"입니다.");
		sc.close();

	}

}
