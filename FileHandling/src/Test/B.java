package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class B {

	public void hey() throws IOException
	{
		File f = new File("./TxtFile/A.txt");
		FileReader fr  = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		
		while(s!=null)
		{ 
			System.out.println(s);
			s = br.readLine();
		}
	}
	
}
