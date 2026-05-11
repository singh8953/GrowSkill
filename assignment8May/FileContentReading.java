package assignment8May;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileContentReading {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Input File Name");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.next();
		File f = new File( "src/assignment8May/" + fileName);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str="";
		
		int LinesCount =0;
		int countWords=0;
		int TotalCHaracters=0;
		
		int longestWordCOunt=0;
		String longestWord="";
		while((str=br.readLine())!=null)
		{
			LinesCount++;
			System.out.println(str);
			countWords = countWords +  str.split(" ").length;
			TotalCHaracters= TotalCHaracters+ str.length();
			//longestWords
			
			
			String[] words = str.split(" ");
			int len = words.length;
			for(int j=0;j<len;j++) {
				if(words[j].length()>longestWordCOunt) {
					longestWord= words[j];
					longestWordCOunt= words[j].length();
							
				}
			}
			
		}
		br.close();
		
		
		System.out.println("TOtal Lines " + LinesCount);
		System.out.println("TOtal Words " + countWords);
		System.out.println("TOtal Characters " + TotalCHaracters);
		System.out.println("Longest Word >> " + longestWord);
		
	}

}
