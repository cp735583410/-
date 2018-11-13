package p1;
public class TestC{
	public static void main(String[]args){
		add(100);
		//返回该结果到函数调用处打印
		System.out.println(add(100));
	}
	//写一个函数定义整型返回值，此函数用于计算100的所有因子之和
	public static int add(int n){
		int sum=0;
		for(int i=1;i<=100;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		return sum;
	}
}