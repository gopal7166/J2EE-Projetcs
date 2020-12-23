package WaveToText;

import java.io.*;

public class Converter {
	OutputStream Text;
	InputStream MyFile;

	public Converter () throws FileNotFoundException, IOException
	{
	        MyFile = new FileInputStream("C:\\Users\\Abhay Gill\\Desktop\\file\\RecordAudio.wav");
	        Text = new PrintStream(new File("C:\\Users\\Abhay Gill\\Desktop\\file\\Notes.txt"));
	}

	public void ConvertToTxt() throws IOException
	{
	  //  BufferedInputStream in = new BufferedInputStream(MyFile);
      InputStreamReader ir=new InputStreamReader(MyFile);
      BufferedReader br=new BufferedReader(ir);
      String s=br.readLine();
      System.out.println(s); 
	    int read;

	    while ((read = ir.read()) > 0)
	    {
	        Text.write(read);
	    }
	    Text.close();
	}
}
