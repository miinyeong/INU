package practice1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		String symbol;							
		
		while(true) {
			System.out.println("5칙연산 프로그램");
			System.out.print("정수 2개와 문자열 입력: ");
			try {										// num1의 입력값이 정수가 아닐 경우 예외 처리를 위함
				num1 = sc.nextInt();
				symbol = sc.next();
			} catch (InputMismatchException e) {		// num1의 입력값이 정수가 아닐때
				System.out.println("정수를 제대로 입력했는지 확인해주세요!\n");
				sc.next();							// 입력값 3개 모두 예외처리 문자로 입력받기 위함
				sc.next();
				sc.next();
				continue;								// 아래 코드를 실행하지 않고 다음 반복문 실행
			}
			try {										// num2의 입력값이 정수가 아닐 경우 예외 처리를 위함
				num2 = sc.nextInt();					// try문을 2개로 나눈 이유: num1에서 정수값을 제대로 입력 받고 num2에서 에러가 날 경우 예외 문자를 1개만 입력받기 위함
			} catch (InputMismatchException e) {
				System.out.println("정수를 제대로 입력했는지 확인해주세요!\n");
				sc.next();								// num1, symbol은 정상적으로 입력 받았으므로 num2의 값만 예외처리 문자로 입력받음
				continue;								// 아래 코드를 실행하지 않고 다음 반복문 실행
			}
			if(symbol.equals("=")) {					// symbol의 값이 "="일 경우 종료
				System.out.println("프로그램 종료");
				break;
			}
			switch (symbol) {							// symbol의 입력값에 따라 연산방법을 다르게 하기위해 switch문 작성
			case "+": {
				System.out.println("결과: "+(num1+num2)+"\n");
				break;
			}
			case "-": {
				System.out.println("결과: "+(num1-num2)+"\n");
				break;
			}
			case "*": {
				System.out.println("결과: "+(num1*num2)+"\n");
				break;
			}
			case "/": {									
				try {												// 정수를 0으로 나누는 경우의 예외처리를 위해 try문 작성
					System.out.println("결과: "+(num1/num2)+"\n");
					break;
				} catch (ArithmeticException e) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요!\n");	// 정수를 0으로 나눌 경우 다시 입력해 달라는 출력문 다음에 continue를 
					continue;													// 실행함으로써 아래 코드를 실행하지 않고 다음 반복 실행
				}
				
			}
			case "%": {
				System.out.println("결과: "+(num1%num2)+"\n");
				break;
			}
			default:
				System.out.println("연산 기호를 다시 확인해주세요!!\n");		// symbol값이 case조건 안에 없을 경우 잘 못 입력했다는 출력문과 함께 switch문 탈출
				break;
			}
			
		}
		sc.close();
	}

}
