package api.io.rw03;

import java.io.FileReader;

public class FlieReaderEx {

	public static void main(String[] args) {
	
		/*
		 * 문자기반으로 읽어들이는 클래스 FlieReader
		 * 2byte단위로 읽어들이기 때문에 문자를 읽기에 적합하다.
		 */
		
		FileReader fr = null;
		
		try {
			
			fr = new FileReader("C:\\Users\\woohyun\\Desktop\\programming\\course\\java\\file\\test.txt");
			
			while(true) {
				int result = fr.read();
				if(result == -1) break;
				System.out.print((char)result);
			}
			
		} catch (Exception e) {
			
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
				
			}
		}
	}
	
	
}
