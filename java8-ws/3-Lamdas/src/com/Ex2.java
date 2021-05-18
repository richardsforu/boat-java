package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@FunctionalInterface
interface BufferedReaderProcessor {

	String process(BufferedReader br) throws IOException;
}

public class Ex2 {

	public static String readTopics(BufferedReaderProcessor bp) throws IOException {
		File file = new File("topics.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			//return br.readLine(); // logic
			return bp.process(br);
		}
	}

	public  static String readTopic_V2()throws IOException {
		File file = new File("topics.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			//return br.readLine(); // logic
			return br.readLine();
		}
		
	}

	public static String readTopic_V1() {
		File file = new File("topics.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file)); // initi
			return br.readLine();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;

	}

	public static void main(String[] args) throws IOException {

		System.out.println(
				//readTopics(br -> br.readLine())
				//readTopics(br->br.readLine()+"\n"+br.readLine())
				readTopics(br->br.readLine()+"\n"+br.readLine()+"\n"+br.readLine())
				
				
				);
		
		

	}

}
