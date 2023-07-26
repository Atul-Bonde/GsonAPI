package com.Gson.Conversion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.Gson.Binding.Employee;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class JsonToJavaobject {
	
	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		
		
		
		Gson g=new Gson();
		Employee employe = g.fromJson(new FileReader("Employee.json"), Employee.class);
		
		
		System.out.println(employe);
		
	}

}
