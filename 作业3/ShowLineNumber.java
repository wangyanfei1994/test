import java.io.Reader;
import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class ShowLineNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new FileReader("E:\\公司培训\\作业\\7-22\\作业3\\ShowLineNumber.java"));
		String str = null;
		int lineNumber = 0;
		while ((str = bfr.readLine()) != null) {
			lineNumber++;
			System.out.println(lineNumber + " " + str);
		}
		
		Reader rfile = new FileReader("ShowLineNumber.java");//创建输入流对象
        Writer wfile = new FileWriter("ShowLineNumber.java.bak"); //创建输出流对象
		char[] cbuf = new char[1000];
		int realChars = 0;
		while ((realChars = rfile.read(cbuf)) != -1) {
			wfile.write(cbuf, 0, realChars);
		}
		rfile.close();
		wfile.close();
		bfr.close();
	}
}
