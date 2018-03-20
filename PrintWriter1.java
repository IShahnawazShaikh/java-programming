import java.io.*;
import java.io.PrintWriter;
class PrintWriter1
{
	public static void main(String[] x)throws IOException
	{
		File f=new File("Shahnawaz.txt");
		f.createNewFile();
		PrintWriter pw=new PrintWriter(f);
		pw.println(100.5);
		pw.print("shahnawaz");
		pw.Print("
		pw.flush();
		pw.close();
	}

}