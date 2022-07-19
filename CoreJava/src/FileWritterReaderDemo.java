import java.io.FileReader;
import java.io.FileWriter;

public class FileWritterReaderDemo {

	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("tops2.txt");
		String s="This is file reader/writter example";
		fw.write(s);
		fw.flush();
		fw.close();
		System.out.println("File Written Successfully");
		
		FileReader fr=new FileReader("tops2.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}
}
