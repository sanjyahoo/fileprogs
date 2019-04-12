package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.SynchronousQueue;

public class Handle {

	public void hi() throws IOException
	{
		File f = new File("./TxtFile/A.txt");
		FileReader fr = new FileReader(f);
		int i = fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i = fr.read();
		}
	}
	
}
