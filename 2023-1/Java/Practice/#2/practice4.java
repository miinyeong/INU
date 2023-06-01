import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
public class practice4 {

	public static void main(String[] args) {
		System.out.print("수식을 입력하세요 >>> ");
		Scanner sc = new Scanner(System.in);
		Vector<String>v=new Vector<String>();	//Vector 객체 v 생성
		String s= sc.nextLine();
		StringTokenizer st=new StringTokenizer(s, "+-",true); //구분 문자 포함해서 토근에 저장
		
		while(st.hasMoreTokens())
			v.add(st.nextToken());
		int sum=Integer.parseInt(v.elementAt(0)); //sum의 초기값은 v의 첫 번째 값
		for(int i=1;i<v.size()-1;i=i+2) { //연산기호부분만 확인
			if(v.elementAt(i+1).equals("+")||v.elementAt(i+1).equals("-")) { //연산 기호가 두번 연속 나오는 경우 프로그램 종료
				System.out.println("프로그램을 종료합니다. ");
				System.exit(0);
			}else {
				if(v.elementAt(i).equals("+"))					// 연산기호가 "+"이면
					sum=sum+Integer.parseInt(v.elementAt(i+1)); //sum과 해당 연산기호 다음 숫자를 더 함
				else if(v.elementAt(i).equals("-"))				// 연산기호가 "-"이면
					sum=sum-Integer.parseInt(v.elementAt(i+1)); //sum과 해당 연산기호 다음 숫자를 더 함
			}
		}
		System.out.println("결과 >>> "+sum);
	}

}
