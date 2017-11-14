 package com.fju.mid;

import java.util.Random;
import java.util.Scanner;

public class Lucky {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println("請輸入一個1-10的數字");
		Scanner scanner = new Scanner(System.in);
		 String line = scanner.nextLine();
		 int number = Integer.parseInt(line);
		int n1 = r.nextInt(10)+1;
		int n2 = r.nextInt(10)+1;
		int n3 = r.nextInt(10)+1;
		int n4 = r.nextInt(10)+1;
		int n5 = r.nextInt(10)+1;
		int n6 = r.nextInt(10)+1;
		System.out.print(n1);
		System.out.print(" "+n2);
		System.out.print(" "+n3);
		System.out.print(" "+n4);
		System.out.print(" "+n5);
		System.out.print(" "+n6);
		if((number) == n1){
			 System.out.println(" yes");}
		 else{ if(number == n2){
			 System.out.println(" yes");}
		else{ if(number == n3){
			System.out.println("  yes");}
		else{ if(number == n4){
			System.out.println("  yes");}
		else{ if(number == n5){
			System.out.println("  yes");}
		else{ if(number == n6){
			System.out.println("  yes");
		 }
		else{System.out.println("  no");

	}

}}
	}}}}}
