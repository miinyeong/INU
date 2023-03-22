import java.util.Scanner;
public class WhileSample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");
		
		int num = sc.nextInt();
		while(num != -1) {
			sum += num;
			count++;
			num = sc.nextInt();
		}
		if(count == 0) {
			System.out.println("입력된 수가 없습니다.");
		}else {
			System.out.print("정수의 개수는 " + count + "개이며 ");
			System.out.println("평균은 " + (double)sum/count + "입니다.");
		}
		sc.close();
	}

}
