import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
class fileReader
{
	public static void main(String[] x)throws IOException
	{
		 File f=new File("shahnawaz.txt");
		 f.createNewFile();
		 FileWriter fw=new FileWriter("shahnawaz.txt");
		 fw.write("prolog academy");
		 fw.write('2');
		 fw.flush();
		 fw.close();
		 FileReader fr=new FileReader("shahnawaz.txt");
		 int i=fr.read();
		 while(i!=-1)
		{
		 System.out.println((char)i);
		   i=fr.read();
		}
		 fr.close();
    }
}