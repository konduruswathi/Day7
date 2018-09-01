package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.FileIo.BinaryInteger;

class BinaryIntegerTest {

		@Test
		void testBinaryInteger() {
			File file = new File("C:\\swathi\\Niharika.txt");
			assertEquals(1,BinaryInteger.writeBinary(file));
		}

	

	}


