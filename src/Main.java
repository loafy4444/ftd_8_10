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
				Student test = new Student("Ben", "Ricks", "04/19/1980", "36", 
							"2484 Routt Ave.", "Grand Junction", "Colorado");

//				bw.write(test.toString());
//				bw.newLine();
				bw.write(test.firstName);
				bw.newLine();
				bw.write(test.lastName);
				bw.newLine();
				bw.write(test.dob);
				bw.newLine();
				bw.write(test.age);
				bw.newLine();
				bw.write(test.address);
				bw.newLine();
				bw.write(test.city);
				bw.newLine();
				bw.write(test.state);
				bw.newLine();
				
				
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
							
				Student test = new Student(br.readLine(), br.readLine(), br.readLine(), br.readLine(), br.readLine(), br.readLine(), br.readLine());

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

	}

}
