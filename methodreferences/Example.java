package com.java8features.methodreferences;
import java.util.Arrays;
//method reference to an instance method of an arbitary object of a particular type
public class Example {

	public static void main(String[] args) {
		//create a collection
		String[]stringArray= {
				"rameez","fathima","programming","java8","method","reference"
		};
		//Arrays.sort(stringArray,String::compareToIgnoreCase);
       // for(String data::stringArray) {
		Arrays.sort(stringArray,String::compareToIgnoreCase);
        for(String data:stringArray) {
			System.out.println(data);
			//System.out.println(data);

	}
}
}

