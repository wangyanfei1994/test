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
        String infname="E:\\��˾��ѵ\\��ҵ\\7-22\\��ҵ3\\ShowFile.java";     //Ĭ�ϵ������ļ���
        try{ 
			//�����.bak�ļ�
			Reader rfile = new FileReader("ShowFile.java");//��������������
            Writer wfile = new FileWriter("ShowFile.java.bak"); //�������������
			char[] cbuf = new char[1000];
			int realChars = 0;
			while ((realChars = rfile.read(cbuf)) != -1) {
				wfile.write(cbuf, 0, realChars);
			}
			rfile.close();
			wfile.close();
			//��ӡ������̨
            File fin=new File(infname);        //ת����ļ�����
            BufferedReader in = new BufferedReader(new FileReader(fin));  //��������
            String s; 
            while((s = in.readLine()) != null){//���ַ���
                
				System.out.println(s);          //д��      
			} 
			in.close(); //�رջ�����������ļ�������������     
        }catch (FileNotFoundException e1){           //�쳣����
            e1.printStackTrace();
        }catch(IOException e2){    
            e2.printStackTrace();
        } 
    } 
}