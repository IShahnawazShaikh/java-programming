import java.io.*;
import java.lang.String;
class duplicate 
{
	public static void main(String[] args) throws IOException
	{
	    File f1=new File("shahnawaz.txt");
		f1.createNewFile();
		File f2=new File("output.txt");
		PrintWriter pw=new PrintWriter(f1);
		pw.println("11111");
		pw.println("22222");
		pw.println("AAAAA");
		pw.println("11111");
		pw.println("shahnawaz");
		pw.println("prolog");
		pw.println("22222");
		pw.flush();
		pw.close();
		FileReader fr1=new FileReader(f1);
		BufferedReader BR1=new BufferedReader(fr1);
		FileReader fr2=new FileReader(f1);
		BufferedReader BR2=new BufferedReader(fr2);
		PrintWriter pw2=new PrintWriter(f2);
		String Line1[]=new String[15];
		String str,str2;
		str=BR1.readLine();
		int inc=0,count=0,i,k;
		while(str!=null)
		{
              Line1[count]=str;
			  ++count;
			  str=BR1.readLine();
		}
		for(i=0;i<count;i++)
		{
		str2=BR2.readLine();
		for(k=0;k<count;k++)
			{
			    boolean b=str2.equals(Line1[k]);
				if(b==true)
				{
					++inc;
				}
			}
			if(inc==1)
			{
				pw2.println(str2);
			}
			inc=0;
		}
		pw2.close();
		/*for(i=0;i<count;i++)
		{
			pw2.println(Line1[i]);
		}
		pw2.close();*/
	}
}
