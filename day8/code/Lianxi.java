//完成数组的冒泡排序算法 ，给定数组：int[] a = {1,2,3,4,5},
//利用冒泡排序对其按照从大到小的顺序排序，然后输出结果。
package p1;
public class Test{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				if(a[j]<a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//数组的选择排序算法。
class TestA{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//数组的快速排序算法
class TestB{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		java.util.Arrays.sort(a);
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//完成数组的冒泡排序算法 ，给定数组：int[] a = {1,2,3,4,5},
//利用冒泡排序对其按照从大到小的顺序排序，然后输出结果。
package p1;
public class Lianxia{
	public static void main(String[]args){
		int []a={12,324,65,8,423,35,98};
		int n=a.length;
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				if(a[j]>a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//完成数组的冒泡排序算法 ，给定数组：int[] a = {1,2,3,4,5},
//利用冒泡排序对其按照从大到小的顺序排序，然后输出结果。
package p1;
public class Lianxia{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				if(a[j]<a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//完成数组的选择排序算法 
//利用选择排序对其按照从小到大的顺序排序，然后输出结果。
package p1;
public class Lianxia{
	public static void main(String[]args){
		int []a={123,3426,678,324,67,999};
		int n=a.length;
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
package p1;
public class Lianxia{
	public static void main(String[]args){
		int []a={2,435,1,87,43,9};
		
		java.util.Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//完成数组的选择排序算法 
//利用选择排序对其按照从小到大的顺序排序，然后输出结果。
package p1;
public class Lianxia{
	//选择排序算法。
	public static void main(String[]args){
		int []a={12,4,567,32,978,22};
		int n=a.length;
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){
				//比较a[i]和a[j]的大小；
				if(a[i]>a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//完成数组的冒泡排序算法
//利用冒泡排序对其按照从小到大的顺序排序，然后输出结果。
package p1;
public class Lianxia{
	public static void main(String[]args){
		int []a={87,23,980,234,765,123};
		int n=a.length;
		//用冒泡排序法
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				if(a[j]>a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
package p1;
public class Lianxia{
	public static void main(String[]args){
		int []a={1,2,6,4,7};
		java.util.Array.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
package p1;
public class Lianxia{
	public static void main(String[]args){
		int []a={1,2,6,4,7};
		java.util.Array.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
	}
}
//数组的选择排序算法。
class TestA{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//数组的选择排序算法。
class TestA{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//数组的选择排序算法。
class TestA{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//完成数组的冒泡排序算法 ，给定数组：int[] a = {1,2,3,4,5},
//利用冒泡排序对其按照从大到小的顺序排序，然后输出结果。
package p1;
public class Test{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(in	t i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				if(a[j]<a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//完成数组的冒泡排序算法 ，给定数组：int[] a = {1,2,3,4,5},
//利用冒泡排序对其按照从大到小的顺序排序，然后输出结果。
package p1;
public class Test{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				if(a[j]<a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//完成数组的冒泡排序算法 ，给定数组：int[] a = {1,2,3,4,5},
//利用冒泡排序对其按照从大到小的顺序排序，然后输出结果。
package p1;
public class Test{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				if(a[j]<a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}