package p1;
public class TestI{
	public static void main(String[]args){
		a(9);
		//返回该结果到函数调用处打印
		System.out.println(a(9));
	}
	//写一个函数定义一个整型参数n，此函数用于计算所有n的因子之和
	public static int a(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		return sum;
	}
}