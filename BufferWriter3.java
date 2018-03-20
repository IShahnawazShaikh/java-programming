import java.io.*;
class  BufferWriter3
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
		Bw.newLine();
		Bw.write("Mariya khanam");
		Bw.flush();
		Bw.close();
		FileReader fr=new FileReader(f2);
		BufferedReader Br=new BufferedReader(fr);
		String line=Br.readLine();
		while(line!=null)
			{
			  System.out.println(line);
			  line=Br.readLine();
		    }

	}
}
