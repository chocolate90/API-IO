package api.io.rw03;

import java.io.FileWriter;

public class FileWriterEx {

	public static void main(String[] args) {
		
		/*
		 * 문자를 써서 저장할 때, 사용하는 클래스 FileWrite
		 * 기본적으로 2byte 단위로 문자를 읽고 쓰기 때문에 문자쓰기에 적합.
		 * 
		 */
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:\\Users\\woohyun\\Desktop\\programming\\course\\java\\file\\test.txt");
			
			String str = "아...어렵다...라고 생각하고 계시죠?\r\n아 집에 가고 싶다."; // \n은 줄바꿈, \r 캐리지리턴(글자를 처음으로)
			
			fw.write(str); // write 메서드는 문자열 자체를 받아준다. 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				
			}
		}
		
	}
}
