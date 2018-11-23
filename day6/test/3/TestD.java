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