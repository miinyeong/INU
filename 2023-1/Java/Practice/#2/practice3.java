import java.util.*;
public class practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");	
		String txt = sc.nextLine();
		String s[] = txt.split(" ");			// 공백 기준으로 값 분리하여 배열에 저장
		String[] split_word = new String[s[0].length()]; // 회전할 문자열을 받을 String배열 생성
		split_word = s[0].split("");				//하기위해 s[0].length()크기로 생성후 split으로 문자열 배열에 저장
		int num = Integer.parseInt(s[1]);			// 공백 뒤에 문자열을 숫자로 변환하여 저장
		if(num == 0) {								// num이 0일경우 프로그램 종료
			System.out.println("프로그램 종료");
			System.exit(0);
		}
		int count = split_word.length/Math.abs(num);//회전 횟수는 split_word를 회전시키기 전 split_word[0] 문자가 split_word를 회전시킨후  
													// split_word[0]부터 split_word[num-1]사이에 있으면 프로그램이 종료되어야 하므로
													//count = split_word.length/Math.abs(num)라 설정
		if(num>0) {							// 입력받은 회전 크기가 양수인 경우
			while(count>0) {				// count가 0보다 클때까지 반복
				for(int i =0;i<num;i++) {
					for(int j=0;j<split_word.length-1;j++) {// num의 크기만큼 split_word의 맨 앞문자를 뒤로 보냄(버블정렬)
						
						String temp = split_word[j];						
						split_word[j] = split_word[j+1];
						split_word[j+1] = temp;
						
					}
					
				}
				for(int k = 0;k<split_word.length;k++) {// num 크기만큼 회전시킨 문자열을 출력
					System.out.print(split_word[k]);
				}
				System.out.println();
				count --;							// 실습파일과 같이 한 바퀴만 회전하기 위함
			}
		}else {											// 입력받은 회전 크기가 음수인 경우
			while(count>0) {
				for(int i =0;i<Math.abs(num);i++) {
					for(int j=split_word.length-1;j>0;j--) {		// num의 절댓값 크기만큼 split_word의 맨 뒤 문자를 앞으로 보냄
						
						String temp = split_word[j];
						
						split_word[j] = split_word[j-1];
						split_word[j-1] = temp;
						
					}
					
				}
				for(int k = 0;k<split_word.length;k++) {			// num 크기만큼 회전시킨 문자열을 출력
					System.out.print(split_word[k]);
				}
				System.out.println();
				count --;
			}
		}
		
	}

}
