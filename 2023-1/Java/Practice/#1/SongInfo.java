package practice1;
import java.util.Scanner;
class Song{									// 노래 한 곡을 나타내는 Song 클래스 작성
	String title, artist, country;			// 4개의 변수 설정
	int year;
	
	public Song() {							// 기본생성자 생성
		this(2020,"대한민국","지코","아무노래");  //this()로 4개의 매개변수를 받는 다른 생성자 호출
	}
	public Song(int year, String country, String artist, String title) { // 4개의 매개변수를 받는 생성자 =
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}
	void Show() {							// 입력받은 변수로 show함수에 출력문 작성
		System.out.println("Song 정보: "+year+"년, "+country+" 국적의 "+artist+"가 부른 "+ "\""+title+"\"");
	}  // 쌍따옴표 출력을 위해 "\""+title+"\""이라 작성
}
public class SongInfo {

	public static void main(String[] args) {
		System.out.println("노래제목 가수 발표년도 국적 순서로 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();			// 공백을 포함한 문자열을 입력받기 위한 nextLine()사용
		String artist = sc.next();
		int year = sc.nextInt();
		String country = sc.next();
		Song[] ob = new Song[2];		// 매개변수 있는 생성자와 기본생성자로 객체 생성과 show메서드 출력을 위해 객체배열 생성
		
		ob[0] = new Song(year,country,artist,title);	// 4개의 매개변수가 있는 생성자로 객체 생성
		ob[1] = new Song();								// 기본 생성자로 객체 생성
		for(int i=0;i<ob.length;i++) {					// 객체 생성 후 show메서드 출력하기 위한 반복문
			ob[i].Show();
		}	
		sc.close();
	}
	

}
