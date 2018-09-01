package com.capgemini.day7.FileIo;
import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	import java.io.LineNumberReader;

	import org.junit.jupiter.api.Test;

	 public class LineCount {

		 public static int countLines(String string) throws IOException {
			    LineNumberReader reader = null;
			    try {
			        reader = new LineNumberReader(new FileReader(string));
			        while ((reader.readLine()) != null);
			        return reader.getLineNumber();
			    } catch (Exception ex) {
			        return -1;
			    } finally { 
			        if(reader != null) 
			            reader.close();
			    }
			
		 }
	 }
		

