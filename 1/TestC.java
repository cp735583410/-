package p1;
//这是主类
public class TestC{
//这是主函数
	public static void main(String[]args){
//while 表示循环 括号内为循环条件
		int i=1;
		int a=1;
		//while表示循环，括号内为布尔表达式，当为真时，执行循环体
		while(i<=10){
			a*=i;
			i++;
		}
		System.out.println(a);
	}
}