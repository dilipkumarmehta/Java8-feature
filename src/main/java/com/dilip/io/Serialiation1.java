package com.dilip.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Serialiation1 {
	public static void main(String[] args) {
		String path = "D:\\myfiles\\hello.txt";
		File file = new File(path); 
		try {
			OutputStream fos = new FileOutputStream(file);
			Test t = new Test(1, 2, "dili", "bangalore");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(t);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Test implements Serializable {
	private int a;
	private int b;
	private String name;
	private String address;

	public Test(int a, int b, String name, String address) {
		this.a = a;
		this.b = b;
		this.name = name;
		this.address = address;
	}

}