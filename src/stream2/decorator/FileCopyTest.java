package stream2.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {

		try(FileInputStream fis = new FileInputStream("a.txt");
				FileOutputStream fos = new FileOutputStream("b.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				){
			int i = 0;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
