import java.io.*;
class CreateDir_Dir_File
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("prolog");
		f.mkdir();
		File f1=new File(f,"Academy");
		f1.mkdir();
		File f2=new File(f1,"shahnawaz.txt");
		f2.createNewFile();

	}
}
