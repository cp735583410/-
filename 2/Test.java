package p1;
//这是主类
public class Test{
//这是主函数
    public static void main(String[]args){
//while表示循环 括号内为循环条件
		int i=1;
		int a=0;
		do{
			a+=i;
			i++;
		}
		while(i<=100);
		System.out.println(a);
	}
	
}