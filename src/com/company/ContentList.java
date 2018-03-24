package com.company;
import java.util.LinkedList;
import java.util.Scanner;

public class ContentList {
	public static void mainWork() {
	LinkedList<Integer> a = new LinkedList<Integer>();
	a = ContentList.cont(5);
	System.out.println(a);
	}
	public static LinkedList<Integer> cont(int count){
		LinkedList<Integer> out = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < count; i++) {
			out.add(sc.nextInt()*7);
		}
		sc.close();
		return out;
	}
}
