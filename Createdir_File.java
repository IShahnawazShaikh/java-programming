import java.io.*;
class Createdir_File
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("prolog");
		f.mkdir();
		File f1=new File(f,"shahnawaz.txt");
		f1.createNewFile();

	}
}
