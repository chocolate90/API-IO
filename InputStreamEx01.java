package api.io.stream01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class InputStreamEx01 {

	public static void main(String[] args) {

		/*
		 * 1. 파일을 byte 단위로 읽을 때 사용하는 클래스 FileInputStream 클래스
		 * 2. 생성자 매개변수로 읽어들일 파일의 전체 경로
		 */

		FileInputStream fis = null;
		try {

			fis = new FileInputStream("C:\\Users\\woohyun\\Desktop\\programming\\course\\java\\file\\test.txt");

			// 1 byte 단위로 읽기

//			while(true) {
//				
//				int result = fis.read();
//				if(result == -1) break;
//				System.out.print((char)result);
//			}

			byte[] arr = new byte[100]; // 
			int result = fis.read(arr); // 읽어들인 바이트의 크기를 반환
			
			System.out.println(Arrays.toString(arr));
			
			int i = 0;
			while(true) {
				
				if(arr[i] == 0) break;
				System.out.print((char)arr[i]);
				i++;
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {

			}
		}
	}
}
