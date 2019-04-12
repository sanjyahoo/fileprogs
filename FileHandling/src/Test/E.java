package Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class E {
	
	public void yo() throws IOException
	{
		File f = new File("./TxtFile/C.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello my name is sanjay sharma");
		bw.flush();
		bw.close();
		
	}

}
