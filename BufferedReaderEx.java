package api.io.buffered04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.security.cert.TrustAnchor;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
		/*
		 * 2byte기반 문자를 읽는, 성능향상 스트림 BufferedReader
		 */
		
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
//			fr = new FileReader("C:\\Users\\woohyun\\Desktop\\programming\\course\\java\\file\\text03.txt");
//			br = new BufferedReader(fr);
			
			br = new BufferedReader(new FileReader("C:\\Users\\woohyun\\Desktop\\programming\\course\\java\\file\\test03.txt"));

			// BufferedReader는 readLine() 메서드가 있고 한줄을 통째로 읽어들인다.
			/*
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			*/
			
			String str;
			while( (str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				
			}
		}
		
	}
}
