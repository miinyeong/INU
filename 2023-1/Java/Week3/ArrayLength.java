import java.util.Scanner;
public class ArrayLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 안에 입력할 원소의 수: ");
		int num = sc.nextInt();
		int intArray[] = new int[num];
		int sum = 0;
		System.out.println(intArray.length+"개의 정수를 입력하세요");
		for(int i =0;i<num;i++) {
			intArray[i] = sc.nextInt();
			sum += intArray[i];
		}
		System.out.print("평균은 " + (double)sum/intArray.length);
		sc.close();

	}

}
