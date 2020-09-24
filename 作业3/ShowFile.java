import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;
public class ShowFile { 
    public static void main(String args[]){  
        String infname="E:\\公司培训\\作业\\7-22\\作业3\\ShowFile.java";     //默认的输入文件名
        try{ 
			//保存成.bak文件
			Reader rfile = new FileReader("ShowFile.java");//创建输入流对象
            Writer wfile = new FileWriter("ShowFile.java.bak"); //创建输出流对象
			char[] cbuf = new char[1000];
			int realChars = 0;
			while ((realChars = rfile.read(cbuf)) != -1) {
				wfile.write(cbuf, 0, realChars);
			}
			rfile.close();
			wfile.close();
			//打印到控制台
            File fin=new File(infname);        //转入的文件对象
            BufferedReader in = new BufferedReader(new FileReader(fin));  //打开输入流
            String s; 
            while((s = in.readLine()) != null){//读字符串
                
				System.out.println(s);          //写出      
			} 
			in.close(); //关闭缓冲读入流及文件读入流的连接     
        }catch (FileNotFoundException e1){           //异常处理
            e1.printStackTrace();
        }catch(IOException e2){    
            e2.printStackTrace();
        } 
    } 
}