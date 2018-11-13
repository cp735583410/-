package p1;
public class TestA{
	public static void main(String[]args){
		a(100);
	}
	//写一个函数定义一个整型参数n，此函数功能用于计算1~n之间的所有和
	public static void a(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		System.out.println(sum);
	}
}