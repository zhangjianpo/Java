package com.jpzhang;

import java.util.Scanner;
/*
 * 测试输入
 */
public class Test1010 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String tmp="";
		StringBuilder result=new StringBuilder();
		//读入所有行，并输出它们
		while(in.hasNextLine()){
			tmp=in.nextLine();
			if("0".equals(tmp)){
				break;
			}
			result.append(tmp+"\n");
		}
		in.close();
		System.out.println(result);
	}
/*
 * 思考：
 * 1、可以对每个读入的值进行处理后存起来，
 *      然后全部处理完之后一起输出（放在StringBuilder中，并处理好格式）
 * 2、关于String的“+”和StringBuilder的append
 *      有循环的自己用StringBuilder处理，其他可以直接用String，因为编译器会自动优化
 */
}
