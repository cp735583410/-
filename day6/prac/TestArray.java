package p1;
public class TestArray{
	public static void main(String[]args){
		/*
		int[]a;//数组的定义int []a int a[]
		a=new int[3];//为数组分配空间 指定数组的长度
		a[0]=1;
		a[1]=2;
		a[2]=3;//为数组元素赋值
		*/
		int[]a={ 1 , 2 , 3 };//数组的显式初始化
		//int[]a=new int[]{1,2,3};
		printArray(a);
	}		
		//遍历数组
	public static void printArray(int[]x){
		//x.length 表示数组的长度，使此函数可以通用
		for(int i=0;i<x.length;i++){
		System.out.println("x["+i+"]="+x[i]);
		}
	}
}

package p1;
public class TestArray{
	public static void main(String[]args){
		/*
		int[]a;//数组的定义 int []a int a[]
		a=new int[3];//为数组分配空间 指定数组的长度
		a[0]=1;
		a[1]=2;
		a[2]=3;
		*/
		int[]a={ 1 , 2 , 3 };//数组的显式初始化
	    //int[]a=new int[]{1,2,3};
		printArray(a);
	}	
		//遍历数组
	public static void printArray(int[]x){
		for(int i=0;i<x.length;i++){
			System.out.println("x["+i+"]="+x[i]);
		}
	}
}
package p1;
public class TestArray{
	public static void main(String[]args){
		/*
		int[]a;//数组的定义 int []a int a[]
		a=new int[3];//为数组分配空间 指定数组的长度
		a[0]=1;
		a[1]=2;
		a[2]=3;
		*/
		int[]a={1,2,3};//数组的显式初始化
		//int []a=new int[]{1,2,3};
		printArray(a);
		
	}
	//遍历数组
	public static void printArray(int[]x){
		for(int i=0;i<x.length;i++){
			System.out.println("x["+i+"]="+x[i]);
		}
	}
}
