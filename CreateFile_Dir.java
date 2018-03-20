import java.io.*;
class CreateFile_Dir
{
	public static void main(String[] args) throws IOException
	{
		int file=0,dir=0,count=0,;
		File f=new File("S:\\M.j leather works");
		String[] s=f.list();
		for(String s1:s)
		{
			count++;
			System.out.println(s1);
			File f1=new File(f,s1);
			 if(f1.isFile())
			{
				 file++;
			}
			if(f1.isDirectory()){
				dir++;
			}
		}
		System.out.println("Number of records="+count);
		System.out.println("total file="+file);
		System.out.println("Total Directory="+dir);
		
	}
}
