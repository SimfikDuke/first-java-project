package com.company;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.awt.image.ColorConvertOp;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWork {
	BufferedReader br = null;
	PrintWriter pw = null;
	File file = null;
	ArrayList<String> input = null;
		
	public void doSomeWork() {
		input = readInFile();
		try {
			file = new File("contest.out");
			if(!file.exists())
				file.createNewFile();
			
			pw = new PrintWriter(file);
			ArrayList<String> c = contest(input);
			for (String string : c) {
				pw.append(string);
			}
			pw.close();
				
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
	ArrayList<String> contest(ArrayList<String> in){
		ArrayList<String> out = new ArrayList<String>();
		for (String string : in) {
			int a = string.hashCode();
			out.add(Integer.toString(a)+"\n");
		}
		return out;
	}
	ArrayList<String> readInFile() {
		ArrayList<String> out = new ArrayList<String>();
		try {
			file = new File("contest.in");
			br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine()) != null) {
				out.add(line);
			}
			br.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error: IO exeption.");
		} 
			return out;
	}
}
