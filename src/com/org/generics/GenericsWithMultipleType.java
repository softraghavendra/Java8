package com.org.generics;

public class GenericsWithMultipleType<DevTeam, QATeam> {
	
	
	public void m1(){
		GenericsWithMultipleType<DevTeam, QATeam> gmt= new GenericsWithMultipleType<DevTeam, QATeam>();
		gmt.m2();
	}
	public void m2(){
		System.out.println("Test of Generics With multiple type !!!");
	}
	
	

}
