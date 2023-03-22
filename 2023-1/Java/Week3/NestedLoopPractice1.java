// 1*1=1, 1*2=2, 1*3=3, 1*4=4 ... 1*9=9 이런식으로 중간에 , 출력 마지막엔 출력 안되게
public class NestedLoopPractice1 {

	public static void main(String[] args) {
		for(int i=2; i<10; i++) { 
			for(int j=1; j<10; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				if(j<9) {
					System.out.print(",");					
				}
				System.out.print('\t'); 
			
			}
			System.out.println(); 
		}
		
	}
}
