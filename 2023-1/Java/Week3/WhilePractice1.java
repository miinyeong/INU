// -1이 입력되기 전까지 정수를 입력받는다.
// 정수가 짝수이면 값 출력하고, 카운트 계산
// -1을 입력하면 짝수 개수 출력

import java.util.Scanner;
public class WhilePractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int count = 0;
		int sum = 0;
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");
		
		int num = sc.nextInt();
		while(num != -1) {
			if(num % 2 ==0) {
				sum += num;
				count++;
				System.out.println(num);			
			}
			num = sc.nextInt();
		}
		if(count == 0) {
			System.out.println("입력된 수가 없습니다.");
		}else {
			System.out.print("짝수 정수의 개수는 " + count + "개이며 ");
			System.out.println("평균은 " + (double)sum/count + "입니다.");
		}
		sc.close();
	}

}
