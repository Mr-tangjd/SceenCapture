package com.tang;

public class NumToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123123;
		String str="";
		try{
			str=String.valueOf(num);		//��һ������ת��Ϊ�ַ���
			System.out.println(str);
		}catch(NumberFormatException e){
			System.out.println(str+"��������ָ�ʽ����ȷ");
		}
		str="321321";
		try{
			num=Integer.parseInt(str);		//��һ���ַ���ת��Ϊ����
			System.out.println(num);
		}catch(NumberFormatException e){
			System.out.println(num+"������ַ�����ʽ����ȷ");
		}
	}

}
