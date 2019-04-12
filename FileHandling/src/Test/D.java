package Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class D {

	public void hello() throws IOException
	{
	File f = new File("./TxtFile/B.txt");
	FileWriter fw = new FileWriter(f);
	fw.write("Sanjay");
	fw.flush();
	fw.close();
   }
}
