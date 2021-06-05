package snippets.s09_fileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamFormWeb {
	InputStream inputStream;
	OutputStream outStream;
	
	public FileInputStreamFormWeb(InputStream in , String fileLocation) {
		
		this.inputStream = in;
		
		try {
			this.outStream = new FileOutputStream(fileLocation);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		byte[] buffer = new byte[1024];
		
			try {
				while(true) {
				int c = inputStream.read(buffer);
				
				if (c == -1)
					break;
				//버퍼 만큼읽고 마지막에는 c 에서 멈춤
				outStream.write(buffer , 0 , c);
				
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					inputStream.close();
					outStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
	
	}
}
