package com.may16;
class Parent{
	int sum(int a,int b){
		return a+b;
	}
}
class Child extends Parent{
	int sum(int a,int b){
		System.out.println("Parent sum is "+super.sum(66,77)); 
		return a+b;
	}
}
public class Methodoveride {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		//System.out.println("Parent class sum is "+p.sum(66,77));
		System.out.println("Child class sum is "+c.sum(66,77));
	}
}
