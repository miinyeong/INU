import java.util.Arrays;
import java.util.Vector;
public class practice5 {

	public static void main(String[] args) {
		Vector<Integer>v=new Vector<Integer>();				// Vector 객체 v 생성
		for(int i =0;i<6;i++) {			
			int n = (int)(Math.random()*45 + 1);			//1~45사이의 랜덤한 수 n에 저장
			v.add(n);										// v에 n의 값 입력
			for(int j = 0;j < i;j++) {						// 중복 제거를 위해 새로운 번호 추가 시 중복되면 
				if(v.elementAt(i) == v.elementAt(j)) {		// 새로 추가된 인덱스의 요소 삭제 후 i--를 함으로써 값 새로 입력받음
					v.remove(i);
					i--;
					break;
				}
			}		
		}
		Object[] objs = v.toArray();			//Vector의 toArray() 함수를 써서 Object 배열로 리턴받은 후에
		Arrays.sort(objs);						//Array 클래스의 sort 함수를 이용해 오름차순으로 정렬
		v.clear();								// 값을 오름차순 순서로 새로 v에 입력받기 위함
		System.out.print("숫자 6개 랜덤으로 추출: ");
		for (int i=0; i < objs.length; i++){		
		       System.out.print(objs[i] + " ");
		       v.add((int)objs[i]);					// v에 오름차순한 값 새로 입력
		}
		System.out.println();

		while(true) {
			int n = (int)(Math.random()*45 + 1);
			v.add(n);								// 값 새로 입력
			for(int i=0;i<6;i++) {					// 새로 입력받은 값과 기존의 6개의 숫자를 비교하여 중복되면 새로 입력받은 값 지우고 다시 입력 받으며
				if(n == v.elementAt(i)) {			// 중복된 값이 없을 때까지 반복
					v.remove(6);
					break;
				}
				
			}
			if(v.size()==7) {						// 입력받은 숫자를 기존의 숫자들과 비교했을 때 중복이 없다면 크기는 7이므로 while문 탈출
				System.out.println("마지막 보너스 숫자 랜덤 추출: "+v.elementAt(6));
				break;
			}
			
		}
		System.out.print("전체 로또번호 출력: ");			// 전체 로또번호 값 출력
		for(int i =0;i<v.size();i++) {
			System.out.print(v.elementAt(i)+" ");
		}
		
	}

}
