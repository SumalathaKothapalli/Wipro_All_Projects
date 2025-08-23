package File_handling;
import java.io.File;

public class CreateNew_file {

	public static void main(String[] args) {
		File f=new File("sample.txt");
		try
		{
			f.createNewFile();
			System.out.println(f.setWritable(true));
		}
		catch(Exception e)
		{
			System.out.println("File not found");
			System.out.println(e);
		}
	}

}
