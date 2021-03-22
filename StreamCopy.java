package api.io.stream01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class StreamCopy {

	public static void main(String[] args) {
		
		// 파일 복사로 옮기기
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// 읽어들일 경로
			fis = new FileInputStream("C:\\Users\\woohyun\\Desktop\\programming\\course\\java\\workspace\\Day12\\src\\api\\io\\stream01\\iu.jpg");
			
			// 복사할 경로
			fos = new FileOutputStream("C:\\Users\\woohyun\\Desktop\\programming\\course\\java\\file\\iu.jpg");
			
			byte[] arr = new byte[100]; // 100byte 단위로 읽음
			
//			while(true) {
//				int result = fis.read(arr);
//				if(result == -1) break;
//				fos.write(arr, 0, result); // arr의 0 ~ result길이 까지 읽는다.
//			}
			
			int result;
			while( (result = fis.read(arr)) != -1 ) {
				fos.write(arr, 0, result);
			}
			
			System.out.println("파일 복사가 정상 처리 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
