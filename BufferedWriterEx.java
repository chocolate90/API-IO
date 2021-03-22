package api.io.buffered04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
//			fw = new FileWriter("C:\\Users\\woohyun\\Desktop\\programming\\course\\java\\file\\test03.txt");
//			bw = new BufferedWriter(fw);
			
			bw = new BufferedWriter(new FileWriter("C:\\Users\\woohyun\\Desktop\\programming\\course\\java\\file\\test03.txt"));
			
			System.out.print("한문장>");
			String str = scan.nextLine();
			System.out.print("두문장>");
			String str1 = scan.nextLine();
			
			bw.write(str + "\r\n" + str1); // 파일을 쓴다.
			bw.flush(); // 버퍼를 비운다.
			
			System.out.println("파일이 정상 출력 되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				bw.close();
				scan.close();
				
			} catch (Exception e2) {
				
			}
			
		}
	}
}
