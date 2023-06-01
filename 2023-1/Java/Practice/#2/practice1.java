import java.util.Calendar;
public class practice1 {
	public static void CalendarEx(Calendar cal) {
		int year = cal.get(Calendar.YEAR);							// 년도 받아오기
		int month = cal.get(Calendar.MONTH)+1;						//월 받아오기
		int day = cal.get(Calendar.DAY_OF_MONTH);					//일 받아오기
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);				//24시 기준 시간 받아오기
		int minute = cal.get(Calendar.MINUTE);						//분 받아오기
		int second = cal.get(Calendar.SECOND);						// 초 받아오기
		System.out.println(year+"년 "+month+"월 "+day+"일");
		System.out.println(hourOfDay+"시 "+minute+"분 "+second+"초");
	}
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();						//Calendar 객체 생성
		CalendarEx(now);
	}

}
