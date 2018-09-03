package com.capgemini.day7.FileIo;

import java.io.File;
import java.time.LocalDate;
import java.util.LinkedList;

public class Assignment {
//	String subject;
	File file;
	LocalDate date;
	public Assignment() {
		super();
		
	}
	
	
	private static LinkedList<Assignment> list=new LinkedList<>();
	
	public Assignment(File file, LocalDate date) {
		super();
		this.file = file;
		this.date = date;
	}

	public static boolean adding(Assignment assignment) {
		if(list.add(assignment))
		return true;
		else
			return false;
	}

	public static boolean remove(Assignment assignment) {
		if(list.remove(assignment))
			return true;
		else
			return false;
	}



	public static void show() {
		for(Assignment a:list)
			System.out.println(a);
		
	}
	
	public static Assignment search() {
		
		int result = 0;
		Assignment early = list.getFirst();
//		System.out.println(result);

		for (Assignment assignments : list) {
			if (early.equals(assignments)) {
				continue;
			}
			result = assignments.date.compareTo(early.date);
			System.out.println(result);
			if (result < 0) {
				early = assignments;
			}
		}
		System.out.println(early);
		return early;
	}
	
	public File getSubject() {
		return file;
	}
	public void setSubject(File file) {
		this.file = file;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Assignment [subject=" + file + ", date=" + date + "]";
	}
}
