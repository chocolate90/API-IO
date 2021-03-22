package api.io.folder02;

import java.io.File;

public class DeleteFileEx {

	public static void main(String[] args) {
		
		// 폴더를 삭제하는 방법
		
		try {
			
			File file = new File("C:\\Users\\woohyun\\Desktop\\programming\\course\\java\\filetest");
			
			if(file.exists()) {
				file.delete();
				System.out.println("삭제 완료");
			} else {
				System.out.println("해당 폴더가 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
