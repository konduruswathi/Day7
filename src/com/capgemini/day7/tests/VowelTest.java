package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.FileIo.Vowels;

class VowelTest {

	@Test
	void test() throws FileNotFoundException, IOException {
		File file=new File("C:\\swathi\\swathi.txt");
				assertEquals(5,Vowels.countVowels(file));
				
				
			
	}

}
