package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.FileIo.LineCount;


class LineCountTest {

	@Test
	void testlineCount() throws IOException {
		assertEquals(3,LineCount.countLines("C:\\swathi\\swathi.txt"));
	}

}
