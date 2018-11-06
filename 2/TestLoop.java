package p1;
//这是主类
public class TestLoop{
//主函数
	public static void main(String[]args){
		int i=0;
//do while 先执行循环体，再判断条件
		do{
			System.out.println("Hello World"+i);
			i++;
		}
		while(i<10);
	}
}