package com.cn.baizhi;
public class TestA{
	public static void main(String[]args){
		int arr []=new int[5];//数组的定义
		//为数组分配空间 指定数组的长度
		arr [0]= 10;
		arr [1]= 11;
		arr [2]= 12;
		arr [3]= 13;
		arr [4]= 14;
		
		//进行遍历
		for(int i=0;i<5;i++){
			System.out.println(arr[i]);
		}
	}
}