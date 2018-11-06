package p1;
//这是主类
public class TestC{
//这是主函数
	public static void main(String[]args){
//do while 先执行循环代码块，再看循环条件
		int i=1;
		int a=0;
		do{
			if(i%3==0){
				a+=i;
			}
				i++;
			
		}while(i<=100);
		System.out.println(a);
	}
}