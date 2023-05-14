import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		for(int i = 0; i<10;i++) {
			int n = (int)(Math.random()*100 +1);
			v.add(n);
		}
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
	}

}
