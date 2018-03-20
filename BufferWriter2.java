import java.io.*;
class  BufferWriter2
{
	public static void main(String[] args)throws IOException
		{
		File f=new File("Prolog");
		f.mkdir();
		File f2=new File(f,"shahnawaz.txt");
		f2.createNewFile();
		BufferedWriter Bw=new BufferedWriter(new FileWriter(f2));
		Bw.write("65");
		char ch[]={'a','b'};
		Bw.newLine();
		Bw.write(ch);
		Bw.newLine();
		Bw.write("shahnawaz");
		Bw.flush();
		Bw.close();
	}
}
