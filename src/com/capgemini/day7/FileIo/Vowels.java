package com.capgemini.day7.FileIo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Vowels {
	static int count=0;
	static int count1=0;

	public static int countVowels(File file) throws FileNotFoundException, IOException {
		try(FileReader fileReader=new FileReader(file);
				BufferedReader reader=new BufferedReader(fileReader);){
			String s;
		while((s=reader.readLine())!=null)
		{
			for(int i=0;i<s.length();i++)
			{
				char c=s.charAt(i);
				if(c>='A' && c<='Z' || c>='a' && c<='z') {
				if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
					count=count+1;
				}
				else
				{
					count1=count1+1;
				}
			}
		}
	
		}}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Vowels is "+count+ "consonants is "+count1);
		return count;
	}
}
