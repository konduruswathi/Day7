package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.FileIo.Grep;

class GrepTest {

	@Test
	void GrepTest() {
		

File file=new File("C:\\swathi\\Nikitha.txt");
assertEquals(true,Grep.stringSearch(file,"cats"));

			}

		
	}


