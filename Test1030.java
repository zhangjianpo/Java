package com.jpzhang;

public class Test1030 {
/*
 * 汽水瓶问题，递归
 */
	public static void main(String[] args) {
		int tmp=fun1(81);
		fun(81);
		System.out.println(tmp);
		System.out.println(Test1030.tmp);
	}

	//借助于全局变量
	private static int tmp;
	public static void fun(int n){
		if(n==2) {
			tmp+=1;
			return;
		}
		if(n<2) return;
		tmp+=n/3;
		n=n/3+n%3;
		fun(n);
	}
	//不借助全局变量
	public static int fun1(int n){
		if(n==2) return 1;
		if(n<2) return 0;
		int tmp=n/3;
		n=n/3+n%3;
		return tmp+fun1(n);
	}
}
/*
 * 递归要注意方法出口，不然会引起栈溢出^v^
 * 递归可以借助全局变量
 */
