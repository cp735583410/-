package p1;
public class TestB{
	public static void main(String[]args){
		int[]a=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		jieshou(a,5);
	}
	//定义一个函数接收一个整型数组arr，和一个整数n.此函数功能用于判断n是否在数组中出现过，如果出现过打印它的下标。
	public static void jieshou(int[]arr,int n){
		for(int i=0;i<arr.length;i++){
			//当能出现在数组中时；
			if(arr[i]==n){
				//打印下标
				System.out.println(i);
				return;
			}

		}
	}
}