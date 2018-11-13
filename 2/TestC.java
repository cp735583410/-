package p1;
public class TestC{
	public static void main(String[]args){
		a(10);
	}
	//写一个函数定义一个整型参数n，此函数功能用于打印1~100之间所有n的倍数
	public static void a(int n){
		for(int i=1;i<=n;i++){
			int a=i*i;
		   System.out.print(a+" ");
		}
		System.out.println();
	}
}