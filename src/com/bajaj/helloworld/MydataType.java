package com.bajaj.helloworld;
import java.util.*;
public class MydataType extends Object {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String f=sc.nextLine();
		char g=	f.charAt(0);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		float c=12.2f;
		float d=13.5f;
		float e=multiply(c,d);
		
		System.out.println(e);
		System.out.println(add(a,b));
		swap(a,b);
		
		System.out.println(ascii(g));
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static float multiply(float a,float b) {
		return a*b;
	}
	public static int ascii(char ch) {
		return ch-'a';
	}
	public static void swap(int a,int b) {
		int t =a;
		a=b;
		b=t;
		System.out.println(a+" "+b);
	}

}
