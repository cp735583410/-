package p1;
public class Test{
	public static void main(String[]args){
		a(10);
	}
	//写一个函数定义一个整型参数n,此函数功能用于打印n个Hello World
	public static void a(int n){
		for(int i=0;i<n;i++){
			System.out.print("Hello Wrold");
		}
		System.out.println();
	}
}