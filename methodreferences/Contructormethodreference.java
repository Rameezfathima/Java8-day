package com.java8features.methodreferences;
@FunctionalInterface
interface ConstructorInterface{
 Hello display(String say);

}
class Hello{
	//constructor
	 Hello(String say) {
		System.out.println("Good morning guy...!!!"+say);
	}
}
public class Contructormethodreference {

	public static void main(String[] args) {
		//method reference to a constructor
		ConstructorInterface ref=Hello::new;
		 ref.display("How are you doing..!!");

	}

}
