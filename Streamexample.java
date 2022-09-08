package io.java8features.streanAPI;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;
public class Streamexample {
	public static void main(String[] args) {
		//create a collection
		List<String>names=new ArrayList<String>();
		//add the elements to the list
		names.add("rameezfathima");
		names.add("rameez");
		names.add("ram");
		names.add("raazia");
		names.add("raa");
	//without stream implementation
	int count=0;
	for(String ele:names) {
		if(ele.length()<6)
			count++;
			}
			System.out.println("there are:"+count+"strings with length less than 6");
			System.out.println("----------------------------------------------------");
	
	//lets apply stream now-using lambda expressions
	int number=(int)names.stream().filter(ele->ele.length()<6).count();
	System.out.println("there are:"+count+"strings with length less than 6");
	}
	
		
	}


