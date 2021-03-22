package api.io.stream01;

import java.io.FileOutputStream;
import java.util.Scanner;

public class OutputStreamEx01 {

	public static void main(String[] args) {
		
		/*
		 * OutputStream은 byte(1바이트) 기반 출력 스트림
		 * 1. FileOutputStream은 파일을 쓸 때 사용하는 클래스다.
		 * 2. 생성자 매개값으로 파일을 쓸 파일명 포함, 전체 경로를 지정한다.
		 * 3. io패키지는 모든 클래스가 throws키워드가 있기 때문에 try~catch를 함께 써야 한다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("파일명>");
		String name = scan.next();
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:\\Users\\woohyun\\Desktop\\programming\\course\\java\\file\\" + name + ".txt");
			
			System.out.println("문장을 입력해 주세요>");
			scan.nextLine(); // next() 다음에 nextLine()을 쓰려고 할 때 그냥 넘어가 버리는 문제
			String str = scan.nextLine(); // 입력받을 문장
			
			byte[] arr = str.getBytes(); // 문자열을 byte데이터로 변경해주는 기능
			
			fos.write(arr); // 파일을 바이트 단위로 써내림
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				scan.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
