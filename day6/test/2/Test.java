package p1;
public class Test{
	public static void main(String[]args){
		int[]a;//数组的定义 int []a int a[]
		a=new int[5];//为数组分配空间 指定数组的长度
		a[0]=5;
		a[1]=6;
		a[2]=7;
		a[3]=8;
		a[4]=9;
		
		//遍历数组
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}
	}
}