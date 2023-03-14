import java.util.Scanner;
public class ScannerEx {
	public static void main(String args[]) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner sc = new Scanner(System.in);
		String name = sc.next(); // 문자열 읽기
		System.out.print("이름은 " + name + ", ");
		String city = sc.next(); // 문자열 읽기
		System.out.print("도시는 " + city + ", ");
		int age = sc.nextInt(); // 정수 읽기
		System.out.print("나이는 " + age + "살, ");
		double weight = sc.nextDouble(); // 실수 읽기
		System.out.print("체중은 " + weight + "kg, ");
		boolean single = sc.nextBoolean(); // 논리값 읽기
		System.out.println("독신 여부는 " + single + "입니다.");
		sc.close(); // scanner 닫기
	}
}