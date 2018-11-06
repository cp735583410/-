package p1;
//这是主类
public class TestA{
//这是主函数
	public static void main(String[]args){
		int i=1;
		int a=0;
//do while 先执行循环体，再判断条件
		do{
			if(i%2!=0){
				a+=i;
			}
			i++;
		}while(i<=100);
		System.out.println(a);
	}
}