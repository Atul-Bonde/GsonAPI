package com.Gson.Conversion;

import com.Gson.Binding.Employee;
import com.google.gson.Gson;

public class JavaObjectToJson {
	
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Atul");
		emp.setAge(26);
		emp.setAdd("Wani");
		
		
		Gson g=new Gson();
		String json = g.toJson(emp);
		System.out.println(json);
		
	}

}
