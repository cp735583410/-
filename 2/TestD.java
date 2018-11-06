package p1;
//这是主类
public class TestD{
//这是主函数
	public static void main(String[]args){
//do while 先执行循环体，再判断条件
		int i=1;
		int a=0;
		//do while 先执行代码块，再判断条件
		do{
			if(i%3==0&&i%5!=0){
				a+=i;
			}
			i++;
		}while(i>=1&&i<=100);
		System.out.println(a);
	}
}
