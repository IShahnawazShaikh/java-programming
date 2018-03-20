import java.io.*;
import java.io.FileWriter;
class NumberCharacter 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("shahnawaz.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter("shahnawaz.txt");
		fw.write("112");
		fw.write(" prolog academy ");
		fw.write('z');
		char[] ch={'a','c'};
		fw.write(ch);
		fw.flush();
		System.out.println(f.length());
		fw.close();
	}
}
