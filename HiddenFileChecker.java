import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class HiddenFileChecker
{
	public static void main(String args[])
	{
		Check check = new Check();
		check.initiate();
	}
	
	private void initiate()
	{
		try
		{
			Path currentDirandFile = Paths.get("./abc123.txt");
			System.out.println("File " + currentDirandFile + " is hidden: " + Files.isHidden(currDirAndFile));
		}catch(IOException ioe)
		{
			System.out.println("Exception: " + ioe);
		}
	}
}
