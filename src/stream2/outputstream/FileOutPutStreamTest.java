package stream2.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest {

	public static void main(String[] args) {

		byte[] bs = new byte[26];
		byte data = 65;
		
		for(int i = 0; i < bs.length; i++) {
			bs[i] = data++;
		}
		
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(bs);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("end");
	}

}
