import java.util.Scanner;
public class ScannerEx2 {
	public static void main(String args[]) {;
		Scanner sc = new Scanner(System.in);
		System.out.println("학번을 입력하세요: ");
		int grade = sc.nextInt(); // 문자열 읽기
		System.out.println("이름을 입력하세요: ");
		String name = sc.next(); // 문자열 읽기
		System.out.println("국어점수를 입력하세요: ");
		int kor = sc.nextInt(); // 정수 읽기
		System.out.println("영어점수를 입력하세요: ");
		int eng = sc.nextInt(); // 정수 읽기
		System.out.println("수학점수를 입력하세요: ");
		int mat = sc.nextInt(); // 정수 읽기
		System.out.println("과학점수를 입력하세요: ");
		int sci = sc.nextInt(); // 정수 읽기
		
		int sum = 0;
		sum = kor+eng+mat+sci;
		float avg =0.0f;
		avg = sum/4.0f;
		System.out.println(name+"님의 학번은 "+grade+", "+"국영수과 점수는 "+ kor+", " + eng+", " +mat+", " +sci+ "이고 점수 합계는 "+sum+"이고 평균은 "+avg+"입니다.");
		
		sc.close(); // scanner 닫기
	}
}