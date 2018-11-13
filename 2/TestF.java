package p1;
public class TestF{
	public static void main(String[]args){
		a(3,2.52);
	}
	//写一个函数接收一个小数参数和一个整型参数，此函数功能用于打印整数与小数的积
	public static void a(int n,double a){
		double c=a*n;
		System.out.println(c);
	}
}