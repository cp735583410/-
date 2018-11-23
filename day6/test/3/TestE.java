package p1;
public class TestE{
	public static void main(String[]args){
		int[]arr={1,2,3,4,5,6,7};
		System.out.println(add(arr));
	}
	//定义一个函数接收一个整型数组arr，此函数用于计算该数组所有偶数下标的和并返回到函数调用处打印
	public static  int add(int[]arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			//当下标i是偶数时，sum+=i;
			if(i%2==0){
				sum+=i;
			}
		}
		return sum;
	}
}