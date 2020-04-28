package com.vs.create;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try {
	FileWriter fw = new FileWriter("D://files/filename.txt");
	fw.write("Files in java are tricky but they are magic");
	fw.close();
	System.out.println("Sucessfully Updates");

	} catch (IOException e) {
		System.out.println(" Exception is "+e);
	}
	}

}
