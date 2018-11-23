/**
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

package p1;
public class TestC{
	public static void main(String[]args){
		int []arr={1,2,3,4};
		add(arr);
		System.out.println(add(arr));
	}
	//定义一个函数接收一个整型数组arr，此函数用于计算该数组每个元素的和，并返回到函数调用处打印
	public static int add(int[]arr){
		int sum=0;
		//利用循环，每循环一次 sum+arr[i]
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
}

package p1;
public class TestD{
	public static void main(String[]args){
		int []arr={1,2,3,4};
		System.out.println(add(arr));
	}
	//定义一个函数接收一个整型数组arr，此函数用于计算该数组所有元素的平均值并返回到函数调用处打印
	public static int add(int[]arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			//利用循环，每循环一次 sum+arr[i]
			sum+=arr[i];
		}
		//arr.length是数组的长度。
		int a=sum/arr.length;
		return a;
	}
}
package p1;
public class Lianxi{
	public static void main(String[]args){
		int []a={1,2,3,4};
		jieshou(a,2);
	}
	//定义一个函数接收一个整型数组arr,和一个整数n,此函数功能用于判断n是否在数组中出现过
	public static void jieshou(int[]arr,int n){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				System.out.println(i);
				return ;
			}
		}
	}
}

package p1;
public class Lianxi{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		add(a);
		System.out.println(add(a));
	}
	//定义一个函数接收一个整型数组arr，此函数用于计算该数组每个元素的和，并返回到函数调用处打印
	public static int add(int[]arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];//每循环一次，sum+arr[i]
		}
		return sum;
		
	}
}

package p1;
public class Lianxi{
	public static void main(String[]args){
		int []b={1,2,3,4,5};
		System.out.println(add(b));
	}
	//定义一个函数接收一个整型数组arr，此函数用于计算该数组所有元素的平均值并返回到函数调用处打印
	public static  int add(int[]arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		//arr.length是数组的长度。
		int a=sum/arr.length;
		return a;
	}
}
package p1;
public class Lianxi{
	public static void main(String[]args){
		int []b={1,2,3,4,5,88};
		jieshou(b,88);
	}
	//定义一个函数接收一个整型数组arr，和一个整数n.此函数功能用于判断n是否在数组中出现过，如果出现过打印它的下标。
    public static void jieshou(int[]arr,int n){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				System.out.println(i);
				return;
			}
		}
	}
}

package p1;
public class Lianxi{
	public static void main(String[]args){
		int []a={1,2,3,4,5,6,7};
		add(a);
		System.out.println(add(a));
	}
	//定义一个函数接收一个整型数组arr，此函数用于计算该数组每个元素的和，并返回到函数调用处打印
	public static int add(int[]arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
}

package p1;
public class Lianxi{
	public static void main(String[]args){
		int []c={1,2,3,4,5,6,7,8,9,10};
		a(c);
		System.out.println(a(c));
	}
	//定义一个函数接收一个整型数组arr，此函数用于计算该数组所有元素的平均值并返回到函数调用处打印
	public static int a(int []arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		int b=sum/arr.length;
		return b;
	}
}
*/
//定义一个函数接收一个整型数组arr，和一个整数n.此函数功能用于判断n是否在数组中出现过，如果出现过打印它的下标。
package p1;
public class Lianxi{
	public static void main(String[]args){
		int []a={2,4,3,1,5};
		jieshou(a,2);
	}
	public static void jieshou(int []arr,int n){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				System.out.println(i);
				return;
			}
		}
	}
}