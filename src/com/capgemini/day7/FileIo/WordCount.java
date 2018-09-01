package com.capgemini.day7.FileIo;


	import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
	import java.io.IOException;

	public class WordCount {
		

		public static int countNumberOfWords(File file) {
//			String s;
			int count = 0;
			try(FileReader fr=new FileReader(file);
					BufferedReader reader = new BufferedReader(fr))
					{
				
				String s;
				while ((s = reader.readLine()) != null) {
					int ct=1;
					for(int i = 0; i < s.length();i++)
					{
						if(s.charAt(i)==' ')
						{
							ct++;
						}
					}
					count = count + ct;
				}
				return count;
			} catch (IOException e) {
				e.printStackTrace();
			}

			return -1;
		}

	}


