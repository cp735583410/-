package p1;
//这是主类
public class TestC{
//主函数	
 	public static void main(String[]args){
		int sum=1;
		//for循环先赋值语句，再判断条件，再执行循环体，最后执行语句
		for(int i=1;i<=10;i++){
			sum*=i;
		}
		System.out.println(sum);
	}
}