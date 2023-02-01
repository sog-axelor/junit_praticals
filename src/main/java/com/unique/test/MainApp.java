package com.unique.test;


public class MainApp {
	public int calsi(int p, int r, int n)
	{
		int si = (p*r*n)/100;
		System.out.println("This is Simple interest : " + si);
		return si;
	}
	
	public static void main(String[] args) {
		  MainApp ma = new MainApp();
		  ma.calsi(5000, 12, 3);
	}
}
