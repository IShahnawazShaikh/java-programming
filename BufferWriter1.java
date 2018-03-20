import java.io.*;
class  BufferWriter1
{
	public static void main(String[] args)throws IOException
		{
		BufferedWriter Bw=new BufferedWriter(new FileWriter("irfan.txt"));
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
