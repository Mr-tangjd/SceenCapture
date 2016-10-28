package com.tang;

public class NumToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123123;
		String str="";
		try{
			str=String.valueOf(num);		//将一个数字转化为字符串
			System.out.println(str);
		}catch(NumberFormatException e){
			System.out.println(str+"输入的数字格式不正确");
		}
		str="321321";
		try{
			num=Integer.parseInt(str);		//将一个字符串转化为数字
			System.out.println(num);
		}catch(NumberFormatException e){
			System.out.println(num+"输入的字符串格式不正确");
		}
	}

}
