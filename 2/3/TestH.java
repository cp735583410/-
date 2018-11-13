package p1;
public class TestH{
	public static void main(String[]args){
		a(32);
		//返回该结果到函数调用处打印
		System.out.println(a(32));
	}
	//写一个函数定义一个整型参数n，此函数用于计算1~100之间所有n的倍数之和
	public static int a(int n){
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%n==0){
				sum+=i;
			}
		}
		return sum;
	}
}