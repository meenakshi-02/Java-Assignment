package assignment.java11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class QnA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5. Write a program with menu to accept the price of certain items and display
		// their total. When user selects Option 1: should accept the prices of
		// different
		// products and insert these prices into first file (each amount to be inserted
		// in a newline in the file). Next, total of these values should be saved in a
		// new
		// file. Option 2: should allow the user to view the total of these prices from
		// the second file.
		//		Sample Output: 
		//			Select your option (1: Insert New Price, 2: View Purchase Total, 3: Exit) 
		//			> 1 
		//			> Insert 1st price: 
		//			> 100 
		//			> Price has been saved to the file 
		//			> Do you want to enter price for more items? (Yes/No) 
		//			> Yes 
		//			> Insert 2nd price: 
		//			> 200 
		//			> Price has been saved to the file 
		//			> Do you want to enter price for more items? (Yes/No) 
		//			> No 
		//			> Select your option (1: Insert New Price, 2: View Purchase Total, 3: Exit) 
		//			> 2 
		//			> Total Price of all items is: 300 
		//			> Select your option (1: Insert New Price, 2: View Purchase Total, 3: Exit) 
		//			> 3 
		//			exit program…. 
		//			Hint: Use java 11 features of files and String methods to reduce the line of code. 

		Scanner sc = new Scanner(System.in);
		Path path1 = Path.of("src/assignment/PriceList");
		Path path2 = Path.of("src/assignment/TotalPrice");
		int opt;
		do {
			System.out.println("Select your option (1: Insert New Price, 2: View Purchase Total, 3: Exit)");
			opt = sc.nextInt();

			switch (opt) {
			case 1:
				char yn = 'y';
				int count = 1;
				Integer pr = 0;

				try (BufferedWriter br = Files.newBufferedWriter(path1, StandardOpenOption.TRUNCATE_EXISTING);
						BufferedWriter bw = Files.newBufferedWriter(path2, StandardOpenOption.TRUNCATE_EXISTING)) {

					do {
						System.out.println("Insert price no." + count + " :");
						Integer price = sc.nextInt();
						pr += price;
						br.write(price.toString());
						br.newLine();
						count++;
						System.out.println(
								"Price has been saved to the file\nDo you want to enter price for more items? (y/n)");
						yn = sc.next().charAt(0);
					} while (yn != 'n');

					bw.write(pr.toString());

				} catch (IOException e) {
					e.printStackTrace();
				}
				break;

			case 2:
				try (BufferedReader br = Files.newBufferedReader(path2)) {

					System.out.println("Total Price of all items is: " + br.readLine());

				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 3:
				System.out.println("exit program....");
				break;

			}
		} while (opt != 3);
		sc.close();

	}

}
