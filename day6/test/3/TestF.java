/**定义一个函数接收一个整型数组arr和一个整数n，此函数功能用于判断n是否在数组中出现过,如果出现过打印它的下标，
如果没有出现过则打印一次-1 */
package p1;
public class TestF{
	public static void main(String[]args){
		int []arr={12,324,6,7,43,99};
		System.out.println(a(arr,100));
	}
	public static int a(int []arr,int n){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				return i;
			}
		}
		return -1;
	}
}
