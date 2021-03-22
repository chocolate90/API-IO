package api.io.folder02;

import java.io.File;

public class CreateFileEx {

	public static void main(String[] args) {
		
		// 폴더를 생성하는 방법. file클래스 이용
				
		try {
			File file = new File("C:\\Users\\woohyun\\Desktop\\programming\\course\\java\\filetest");
			
			if( !file.exists()) { // 폴더가 존재하면 true 존재하지 않으면 false
				file.mkdir(); // 폴더생성
				System.out.println("폴더 생성 완료");
			} else {
				System.out.println("해당 폴더가 이미 존재합니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
