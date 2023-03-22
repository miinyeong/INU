// 2*1=2, 3*1=3, ... 9*1=9
// 2*2=4, 3*2=6, ... 9*2=18
public class NestedLoopPractice2 {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) { 
			for(int j=2; j<10; j++) {
				System.out.print(j + "*" + i + "=" + i*j);
				if(j<9) {
					System.out.print(",");					
				}
				System.out.print('\t'); 
			
			}
			System.out.println(); 
		}
		
	}
}
