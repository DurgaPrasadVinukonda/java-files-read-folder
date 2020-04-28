package com.vs.create;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		
		try {
			File myObj = new File("D://files/filename.txt");
			Scanner reader= new Scanner(myObj);
			while(reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
			
			if (myObj .exists()) {
				System.out.println("File name"+myObj.getName());
				System.out.println("File name"+myObj.getAbsolutePath());
				System.out.println("File name"+myObj.canRead());
				System.out.println("File name"+myObj.canWrite());
				System.out.println("File name"+myObj.length());
			}
		} catch (IOException e) {
			System.out.println("Exception"+e);
		}
	}

}
