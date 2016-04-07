package com.jpzhang;

public class Test1040 {
/*
 * 菲波拉契数列
 */
	public static void main(String[] args) {
		int tmp=fun1(5);
		System.out.println(tmp);
	}

	//迭代
	public static int fun(int n){
		if(n==1||n==2){
			return 1;
		}
		int tmp=1,tmp1=1,tmp2=0;
		for(int i=3;i<=n;i++){
			tmp2=tmp;
			tmp=tmp1;
			tmp1=tmp2+tmp1;
		}
		return tmp1;
	}
	//递归
	public static int fun1(int n){
		if(n==1||n==2){
			return 1;
		}else{
			//此处会导致重复计算，所以递归效率不高
			return fun1(n-1)+fun(n-2);
		}
	}
}
