package com.greens;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class Sample {
	
	public static void main(String[] args) throws Throwable {
		
		File f=new File("E:\\Venkat\\Workspace\\Selenium_Batch\\Selenium\\SampleCSV.csv");
		
		FileWriter f1=new FileWriter(f);
		
		CSVWriter csv=new CSVWriter(f1);
		
		String[] s= {"hello", "welcome", "to","csv"};
		String[] s1= {"python", "oracle","c#"};
		
		List<String[]> l=new ArrayList<String[]>();
		l.add(s);
		l.add(s1);
		
		
		
		csv.writeAll(l);
		
		csv.close();
		
		System.out.println("csv file writeen successfully");
		
		
			
	
	
		
		
	
		
		
		
	}
	
	
	

}
