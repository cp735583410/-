package p1;
public class Test{
	public static void main(String[]args){
		add(100);
		System.out.println(add(100));
	}
	//写一个函数定义整型返回值，此函数功能用于计算1~100的和并返回该结果到函数调用处打印
	public static int add(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		return sum;
	}
}