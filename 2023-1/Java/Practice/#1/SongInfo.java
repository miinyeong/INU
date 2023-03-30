package practice1;
import java.util.Scanner;
class Song{									// �뷡 �� ���� ��Ÿ���� Song Ŭ���� �ۼ�
	String title, artist, country;			// 4���� ���� ����
	int year;
	
	public Song() {							// �⺻������ ����
		this(2020,"���ѹα�","����","�ƹ��뷡");  //this()�� 4���� �Ű������� �޴� �ٸ� ������ ȣ��
	}
	public Song(int year, String country, String artist, String title) { // 4���� �Ű������� �޴� ������ =
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}
	void Show() {							// �Է¹��� ������ show�Լ��� ��¹� �ۼ�
		System.out.println("Song ����: "+year+"��, "+country+" ������ "+artist+"�� �θ� "+ "\""+title+"\"");
	}  // �ֵ���ǥ ����� ���� "\""+title+"\""�̶� �ۼ�
}
public class SongInfo {

	public static void main(String[] args) {
		System.out.println("�뷡���� ���� ��ǥ�⵵ ���� ������ �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();			// ������ ������ ���ڿ��� �Է¹ޱ� ���� nextLine()���
		String artist = sc.next();
		int year = sc.nextInt();
		String country = sc.next();
		Song[] ob = new Song[2];		// �Ű����� �ִ� �����ڿ� �⺻�����ڷ� ��ü ������ show�޼��� ����� ���� ��ü�迭 ����
		
		ob[0] = new Song(year,country,artist,title);	// 4���� �Ű������� �ִ� �����ڷ� ��ü ����
		ob[1] = new Song();								// �⺻ �����ڷ� ��ü ����
		for(int i=0;i<ob.length;i++) {					// ��ü ���� �� show�޼��� ����ϱ� ���� �ݺ���
			ob[i].Show();
		}	
		sc.close();
	}
	

}
