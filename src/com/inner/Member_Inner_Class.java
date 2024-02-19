package com.inner;

public class Member_Inner_Class {

	
	private int data = 30;
    class Inner{
            Inner(){System.out.println("Inner Class Instantiated...");}
            void message(){System.out.println("Data is: "+data);}
    }
    public static void main(String[] args) {
    	Member_Inner_Class obj = new Member_Inner_Class();
    	Member_Inner_Class.Inner in = obj.new Inner(); 
            in.message();
    }
}
