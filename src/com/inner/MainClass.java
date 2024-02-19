package com.inner;

public class MainClass {
	private int data = 30;
    void display(){
           class Local{
                   void msg(){System.out.println("Data is: "+data);}
                   void txt(){System.out.println("Sending text from MainClass class...");}
            }

           Local l = new Local();
           l.msg();
           l.txt();
    } 
    public static void main(String[] args) {
   	 MainClass l1 = new MainClass();
            l1.display();
    }

}
