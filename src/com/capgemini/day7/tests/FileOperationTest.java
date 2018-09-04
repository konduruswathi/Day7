package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.FileIo.FileOperations;

import static org.junit.Assert.assertEquals;

		import org.junit.jupiter.api.Test;

		

		class FileOperationsTest {

			@Test
			void testReverse() {
				assertEquals(true, FileOperations.reverse("C:\\swathi\\samples.txt", "C:\\swathi\\ReverseOutput.txt"));
				assertEquals(true, FileOperations.convert("C:\\swathi\\samples.txt", "C:\\swathi\\ConvertOutput.txt"));
				assertEquals(true, FileOperations.compare("C:\\swathi\\samples.txt", "C:\\swathi\\TestFile.txt"));
			}
		
	}


