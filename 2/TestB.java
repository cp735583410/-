package p1;
//这是主类
public class TestB{
//这是主函数
	public static void main(String[]args){
		int i=1;
		int a=1;
//do while 先执行循环体，再判断条件。
		do{
			a*=i;
			i++;
		}while(i<=10);
		System.out.println(a);
	}
}