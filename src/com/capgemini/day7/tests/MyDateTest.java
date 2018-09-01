package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.FileIo.MyDate;

class MyDateTest {

	@Test
	void test() {
		MyDate date1=new MyDate(LocalDate.of(1997, 7, 31));
		MyDate date2=new MyDate(LocalDate.of(1995, 5, 15));
		MyDate date3=new MyDate(LocalDate.of(1997, 1, 20));
		
		ArrayList<MyDate> al=new ArrayList<>();
		al.add(date1);
		al.add(date2);
		al.add(date3);
		ArrayList<MyDate> result=new ArrayList<>();
		try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\\\swathi\\\\swathi.txt");
				  ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
				
				objectOutputStream.writeObject(al);
	}
	
	catch(IOException e) 
		{
		e.printStackTrace();
}
		try (FileInputStream fileInputStream = new FileInputStream("C:\\\\swathi\\\\swathi.txt");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
				
				result=(ArrayList<MyDate>)objectInputStream.readObject();
		}
				catch(IOException e) {
					
				}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println(result);
	}
}