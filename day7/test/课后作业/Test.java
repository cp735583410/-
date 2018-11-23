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
class TestC{
	public static void main(String[]args){
		int []a={1,2,3,4,5,6};
		int n=a.length;
		//逆序输出
		for(int i=n;i>=0;i--){
			System.out.print(a[i]+" ");
		}
	}
}