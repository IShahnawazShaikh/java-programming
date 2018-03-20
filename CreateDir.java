import java.io.*;
class CreateDir 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("shahnawaz");
		File F=new File("shahnawaz.txt");
		f.mkdir();
		F.createNewFile();
		System.out.println(f.exists());
		System.out.println(F.exists());
	}
}
