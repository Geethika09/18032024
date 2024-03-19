package com.qualizeal.javaapp.mainprogram;

import com.qualizeal.javaapp.mainprogram.arithmetic.Arithmetic;
import com.qualizeal.javaapp.mainprogram.unary.Unary;
import com.qualizeal.javaapp.mainprogram.relational.Relational;
import com.qualizeal.javaapp.mainprogram.conditional.ifthen.IfThen;

public class Operators {
	public static void main(String[] args) {
		System.out.println("Arithmetic Operation--");
		Arithmetic arithmetic = new Arithmetic();
		arithmetic.operation1();
		
		System.out.println("Unary Operation--");
		Unary unary = new Unary();
		unary.operation1();

		System.out.println("Relational Operation--");
		Relational relational = new Relational();
		relational.operation1();

		System.out.println("IfThen Operation--");
		IfThen ifThen = new IfThen();
		ifThen.operation1();	
	}
}