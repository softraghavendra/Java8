package com.org.generics;

public class TestGenericsWithMultipleType {

	public static void main(String[] args) {
		GenericsWithMultipleType<DevTeam, QATeam> gmt= new GenericsWithMultipleType<DevTeam, QATeam>();
		gmt.m2();

	}

}
