package p1;
public class TestE{
	public static void main(String[]args){
		a(2,3);
		//返回该结果到函数调用处打印
		System.out.println(a(2,3));
	}
	//写一个函数定义两个整型参数a与b，此函数用于计算a与b的和
	public static int a(int a,int b){
		int c=a+b;
		return c;
	}
}