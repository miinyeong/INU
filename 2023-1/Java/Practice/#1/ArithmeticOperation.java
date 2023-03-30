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
			System.out.println("5Ģ���� ���α׷�");
			System.out.print("���� 2���� ���ڿ� �Է�: ");
			try {										// num1�� �Է°��� ������ �ƴ� ��� ���� ó���� ����
				num1 = sc.nextInt();
				symbol = sc.next();
			} catch (InputMismatchException e) {		// num1�� �Է°��� ������ �ƴҶ�
				System.out.println("������ ����� �Է��ߴ��� Ȯ�����ּ���!\n");
				sc.next();							// �Է°� 3�� ��� ����ó�� ���ڷ� �Է¹ޱ� ����
				sc.next();
				sc.next();
				continue;								// �Ʒ� �ڵ带 �������� �ʰ� ���� �ݺ��� ����
			}
			try {										// num2�� �Է°��� ������ �ƴ� ��� ���� ó���� ����
				num2 = sc.nextInt();					// try���� 2���� ���� ����: num1���� �������� ����� �Է� �ް� num2���� ������ �� ��� ���� ���ڸ� 1���� �Է¹ޱ� ����
			} catch (InputMismatchException e) {
				System.out.println("������ ����� �Է��ߴ��� Ȯ�����ּ���!\n");
				sc.next();								// num1, symbol�� ���������� �Է� �޾����Ƿ� num2�� ���� ����ó�� ���ڷ� �Է¹���
				continue;								// �Ʒ� �ڵ带 �������� �ʰ� ���� �ݺ��� ����
			}
			if(symbol.equals("=")) {					// symbol�� ���� "="�� ��� ����
				System.out.println("���α׷� ����");
				break;
			}
			switch (symbol) {							// symbol�� �Է°��� ���� �������� �ٸ��� �ϱ����� switch�� �ۼ�
			case "+": {
				System.out.println("���: "+(num1+num2)+"\n");
				break;
			}
			case "-": {
				System.out.println("���: "+(num1-num2)+"\n");
				break;
			}
			case "*": {
				System.out.println("���: "+(num1*num2)+"\n");
				break;
			}
			case "/": {									
				try {												// ������ 0���� ������ ����� ����ó���� ���� try�� �ۼ�
					System.out.println("���: "+(num1/num2)+"\n");
					break;
				} catch (ArithmeticException e) {
					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���!\n");	// ������ 0���� ���� ��� �ٽ� �Է��� �޶�� ��¹� ������ continue�� 
					continue;													// ���������ν� �Ʒ� �ڵ带 �������� �ʰ� ���� �ݺ� ����
				}
				
			}
			case "%": {
				System.out.println("���: "+(num1%num2)+"\n");
				break;
			}
			default:
				System.out.println("���� ��ȣ�� �ٽ� Ȯ�����ּ���!!\n");		// symbol���� case���� �ȿ� ���� ��� �� �� �Է��ߴٴ� ��¹��� �Բ� switch�� Ż��
				break;
			}
			
		}
		sc.close();
	}

}
