package com.vs.create;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) {
		try {
			
			File myObj = new File("D://files/filename.txt");
			if (myObj.createNewFile()) {
				System.out.println("File Created:"+myObj.getName());
			} else {
				System.out.println("File Exists:");
			}
		}
		catch(IOException e) {
			System.out.println("An error occured"+e);
		}
	}

}
