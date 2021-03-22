package api.io.buffered04;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * Buffered가 붙은 클래스는 입출력 성능향상을 위한 클래스이며, OutputStream은 바이트 기반이다.
		 * 
		 * Buffered는 생성자의 매개변수로 입출력 클래스를 전달 받는다.
		 */

		Scanner scan = new Scanner(System.in);
		
//		OutputStream fos = null;
		BufferedOutputStream bf = null;
		
		try {
//			fos = new FileOutputStream("C:\\Users\\woohyun\\Desktop\\programming\\course\\java\\file\\test02.txt");
//			bf = new BufferedOutputStream(fos);
			
			bf = new BufferedOutputStream( new FileOutputStream("C:\\Users\\woohyun\\Desktop\\programming\\course\\java\\file\\test02.txt"));
			
			System.out.print("입력할 문자>");
			String str = scan.nextLine();
			
			bf.write(str.getBytes()); // byte기반이기 때문에 매개변수로 byte 배열을 받는다.
			
			bf.flush(); // 모은 버퍼를 전송한다.
			
		} catch (Exception e) {
			
		} finally {
			try {
				bf.close();
				scan.close();
			} catch (Exception e2) {
				
			}
		}
		
		
	}
}
