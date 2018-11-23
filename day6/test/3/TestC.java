package p1;
public class TestC{
	public static void main(String[]args){
		int []a={1,2,3,4};
		add(a);
		System.out.println(add(a));
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