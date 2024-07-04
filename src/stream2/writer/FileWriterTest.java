package stream2.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write("A");
			char[] cBuf = {'B', 'C', 'D'};
			fw.write(cBuf);
			fw.write("하이 반가워");
			fw.write(cBuf, 1, 2);
			fw.write("1234");
			
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
