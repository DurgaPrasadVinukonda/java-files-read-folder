package com.vs.create;

import java.io.File;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) {
		

			File myObj = new File("D://files/filename2.txt");
			if (myObj.delete()) {
				System.out.println("Deleted the file: " + myObj.getName());
			} else {
				System.out.println("Failed to delete the file.");
			}

		
	}

}
