package api.io.buffered04;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * BufferedInputStream은 byte기반 성능향상 스트림이다.
		 * 문자를 쓰기엔 적합하지 않다.
		 * 
		 */
		
		FileInputStream fis = null;
		BufferedInputStream bf = null;
		
		try {
//			fis = new FileInputStream("C:\\Users\\woohyun\\Desktop\\programming\\course\\java\\file\\test02.txt");
//			bf = new BufferedInputStream(fis);
			
			bf = new BufferedInputStream( new FileInputStream("C:\\Users\\woohyun\\Desktop\\programming\\course\\java\\file\\test02.txt"));
			
			while(true) {
				int result = bf.read();
				
				if(result == -1) break;
				
				System.out.print((char)result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (Exception e2) {
				
			}
		}
		
	}
}
