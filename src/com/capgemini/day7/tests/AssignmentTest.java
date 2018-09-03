package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.time.LocalDate;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.FileIo.Assignment;

class AssignmentTest {

	@Test
	void test() {
		
		File f1=new File("C:\\swathi\\subject1.txt");
		File f2=new File("C:\\swathi\\subject2.txt");
		File f3=new File("C:\\swathi\\subject3.txt");
		File f4=new File("C:\\swathi\\subject4.txt");
		
		Assignment a1=new Assignment(f1, LocalDate.of(2018,9,5));
		Assignment a2=new Assignment(f2, LocalDate.of(2018,9,8));
		Assignment a3=new Assignment(f3, LocalDate.of(2018,9,6));
		Assignment a4=new Assignment(f4, LocalDate.of(2018,9,10));
		
		assertEquals(true,Assignment.adding(a1));
		assertEquals(true,Assignment.adding(a2));
		assertEquals(true,Assignment.adding(a3));
		assertEquals(true,Assignment.adding(a4));
		
		assertEquals(true,Assignment.remove(a4));
		
		Assignment.show();
			System.out.println("\n");
			
		assertEquals(a1,Assignment.search());	
	 }

}