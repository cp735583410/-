package p1;
public class TestA{
	public static void main(String[]args){
		int[] a=new int [4];
		a[0]=20;
		a[1]=21;
		a[2]=22;
		a[3]=23;
		arr(a);
	}
	//定义一个函数，函数功能用于遍历整型数组
	public static void arr(int[]x){
		//遍历参数数组
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
	}
}