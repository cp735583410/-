package p1;
public class TestF{
	public static void main(String[]args){
		a(5);
		//返回该结果到函数调用处打印
		System.out.println(a(5));
	}
	//写一个函数定义一个整型参数n，此函数用于计算n的阶乘
	public static int a(int n){
		int b=1;
		for(int i=1;i<=n;i++){
			b*=i;
		}
		return b;
	}
}