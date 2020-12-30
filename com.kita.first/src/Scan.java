import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//new 자리를 올린다? new 타입

//		int num = scan.nextInt(); //. : ~가 가지고 있는 메소드를 사용
//		System.out.println(num);
		
		String str=scan.next();
		System.out.println(str);
		
		scan.close();
	}
}
