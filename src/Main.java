import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) throws IOException {

		File f = new File("C:/Users/ft9/Desktop/blank.txt");

		
		f.createNewFile();
		
		
		InputStream in = new FileInputStream(f);
		OutputStream out = new FileOutputStream(f);

		

	}

}
