package com.raykor.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println("Enter 6 Elements : ");
		for(int i=0;i<6;i++){
			int temp=sc.nextInt();
			al.add(temp);
		}
		System.out.println("Enter Sum : ");
		int sum=sc.nextInt();
		Collections.sort(al);
		System.out.println(findNumber(al, sum));
	}

	static ArrayList<Integer> findNumber(ArrayList al,int  sum){
		int p2=al.size()-1;
		int p1=0;
		ArrayList<Integer> a= new ArrayList<>();
		boolean b=true;
		int temp=0;
		while(b){
			temp=(int)al.get(p1)+(int)al.get(p2);
			if(p1>=al.size()){
				b=false;
			}else if(temp<sum){
				p1++;
			}
			else if(temp>sum){
				p2--;
			}
			else if(temp==sum){
				a.add((int)al.get(p1));
				a.add((int)al.get(p2));
				return a;
			}
		}
		return a;
		
	}
}
