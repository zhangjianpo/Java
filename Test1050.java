package com.jpzhang;

public class Test1050 {
/*
 * 判断101-200之间有多少个素数，并输出所有素数。
 */
	public static void main(String[] args) {
		int tmp=fun();
		System.out.println("\n素数个数："+tmp);
	}
	public static int fun(){
		int count=0;
		for(int i=101;i<=200;i++){
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					break;
				}
				if(j==(int)Math.sqrt(i)){
					count++;
					System.out.print(i+" ");
					if(count%4==0){
						System.out.println();
					}
				}
			}
		}
		return count;
	}

}
