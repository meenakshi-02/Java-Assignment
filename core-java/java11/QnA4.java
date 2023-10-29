package assignment.java11;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class QnA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 4. Using features of Java 11, read the data from a text file (File name:
		// StudentList.txt). Calculate the count of students and print the names as
		// well as the total count of students on the screen. (If any line in file
		// doesn’t contain a name, for such a record blank space should not be printed
		// in the output)
		// Hint: Use java 11 features of files and String methods to reduce the lines of
		// code to be written.

		Path path = Path.of("src/assignment/StudentList");

		try (BufferedReader bf = Files.newBufferedReader(path)) {

			List<String> f = new ArrayList<String>();
			String line = bf.readLine();

			while (line != null) {
				if (!line.isBlank())
					f.add(line);
				line = bf.readLine();
			}

			f.forEach(System.out::println);
			System.out.println("\nNo. of Students = " + f.size());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
