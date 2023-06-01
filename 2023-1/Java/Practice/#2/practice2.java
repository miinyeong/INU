import java.util.Calendar;			//날짜 입력하기 위한 import
import java.util.Scanner;			//날짜 입력받기 위한 import
import java.util.StringTokenizer;	//문자열 분리를 위한 import
public class practice2 {
	public static void CalendarEx(Calendar cal) {
		
		int year = cal.get(Calendar.YEAR);							// 년도 받아오기
		int month = cal.get(Calendar.MONTH)+1;						//월 받아오기
		int day = cal.get(Calendar.DAY_OF_MONTH);					//일 받아오기
		System.out.println("변경한 날짜 데이터: "+year+"년 "+month+"월 "+day+"일");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar changeDate = Calendar.getInstance();
		int[] arr = new int[3];							// 추출한 년월일을 받기 위한 int 배열 생성
		System.out.print("날짜를 입력해주세요(예: 2023/05/01, 2020/5/1, 21/05/01): ");
		String date = sc.next();								//날짜 입력받아 date에 저장
		StringTokenizer st = new StringTokenizer(date,"/");		// '/'기준으로 문자열 분리
		System.out.print("추출한 년,월,일: ");
		int i = 0;
		while(st.hasMoreTokens()){				// st객체안의 값을 처음부터 돌면서 있으면 true리턴
			int num = Integer.parseInt(st.nextToken()); // st객체안의 값을 처음부터 돌면서 있으면 값 반환
			System.out.print(num+" ");
			arr[i] = num;								// st객체안의 값을 arr배열에 순서대로 저장
			i++;
		}
		System.out.println();
		changeDate.clear();								// 날짜를 변경하기 위해 clear()
		changeDate.set(arr[0],arr[1] ,arr[2]);			// 배열의 순서대로 날짜데이터 변경
		CalendarEx(changeDate);							// 변경한 데이터 출력
	}

}
