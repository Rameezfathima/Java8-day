package com.java8features.methodreferences;

import java.util.function.BiFunction;
@FunctionalInterface
interface MyInterface{
	//A method--abstract method
	

	public void display();
}
//make reference to the abstract method and instance method-->
//method reference to an instance method of an object-Object::instanceMethod

/* 2. method reference to static method of the class*/
class Addition{
	static int add(int numberone,int numbertwo) {
		return numberone+numbertwo;
	}
}
public class Student {
//1. Method reference to a instance method of an object-object::instanceMethod
	public void myMethod() {
		System.out.println("instance Method:");
		System.out.println("i have been referenced by the abstract:");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		MyInterface ref=obj::myMethod;
		
		//calling the method of functional Interface
		ref.display();
		//System.out.println("")
		//obj.myMethod();
		
		/*Addition instance=new Addition();
		instance.add(10, 0);*/
		//create an object to class addition
		BiFunction<Integer,Integer,Integer>addition=Addition::add;
		int sum=addition.apply(11, 5);
		System.out.println("Addition of given number is:"+sum);
	}

}
