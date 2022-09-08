package io.java8.features;
import java.util.ArrayList;

//JAVA LAMBDA EXPRESSION WITH NO PARAMETER
interface Mymethod{
    //A METHOD WITH NO PARAMETER
    public String sayHello();

public class AnotherExampl {
    
    //CONCRETE/REGULAR METHOD
    public void display() {
        System.out.println("Hello World");
    }
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);
        al.add(16);
        al.add(17);
        for(int i=0;i<al.size();i++) {
            System.out.println(al);
        }      
        System.out.println("----------------------");
        al.forEach( (result)-> {System.out.println(result);});
        //LAMBDA expression for the method which has no parameter.
        Mymethod display=() ->{ System.out.println("Hello");
        return "Hello in return";};
        System.out.println(display.sayHello());
    }
}
}

