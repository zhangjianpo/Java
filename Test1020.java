package com.jpzhang;

import java.util.Scanner;

public class Test1020 {
/*
 * 汽水瓶问题，华为笔试
 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int tmp=0;
		StringBuilder result=new StringBuilder();
		while(in.hasNext()){
			tmp=in.nextInt();
			if(tmp==0) break;
			result.append(fun(tmp)+"\n");
		}
		in.close();
		System.out.println(result);
	}
	
	public static int fun(int n){
		int tmp=0;
		while(n>2){
			tmp+=n/3;
			n=n/3+n%3;
		}
		if(n==2){
			tmp+=1;
		}
		return tmp;
	}

}



