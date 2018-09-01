package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.FileIo.WordCount;



class WordCountTest {

	@Test
	void testcountNumberOfWords() {
		File file=new File("C:\\swathi\\swathi.txt");
		assertEquals(3, WordCount.countNumberOfWords(file));
		//asserEquals(3,WordCount.countNumberOfWords(file));
	}

}


