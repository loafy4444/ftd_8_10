import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File file = new File("C:/Users/ft9/Desktop/student.txt");
		
		BufferedWriter bw = null;
		BufferedReader br = null;

		if (!file.exists()) {

			try {
				file.createNewFile();
				System.out.println("File student.txt does not exist.  Creating file and adding student information.");
				
				bw = new BufferedWriter(new FileWriter(file));
				Student test = new Student("Ben", "Grand Junction", "Colorado");

				bw.write(test.getName());
				bw.newLine();
				bw.write(test.getCity());
				bw.newLine();
				bw.write(test.getState());
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		} else {

			try {
				System.out.println("File already exists.  Following student information read from file: ");
				br = new BufferedReader(new FileReader(file));
				Student test = new Student(br.readLine(), br.readLine(), br.readLine());

				System.out.println(test.toString());
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		/*
		 * File f = new File("C:/Users/ft9/Desktop/blank.txt");
		 * 
		 * if(!f.exists()) f.createNewFile();
		 * 
		 * // f.delete(); // f.deleteOnExit();
		 * 
		 * //Input Streams and Buffers InputStream in = new FileInputStream(f);
		 * 
		 * BufferedInputStream buff = new BufferedInputStream(in);
		 * BufferedReader read = new BufferedReader(new
		 * InputStreamReader(buff));
		 * 
		 * BufferedReader fread = new BufferedReader(new FileReader(f));
		 * 
		 * //Output Streams and Buffers OutputStream out = new
		 * FileOutputStream(f);
		 * 
		 * BufferedOutputStream bwriter = new BufferedOutputStream(out);
		 * BufferedWriter write = new BufferedWriter(new
		 * OutputStreamWriter(bwriter));
		 * 
		 * BufferedWriter fwrite = new BufferedWriter(new FileWriter(f));
		 * 
		 * // Bad Idea!! // while(f.read != -1){ // f.read(); // }
		 */

	}

}
