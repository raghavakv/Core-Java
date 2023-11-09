package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class TestCheckedExeception1 {

	public static void main(String[] args) {
		File f = new File("D:\\java\\Raghava.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
