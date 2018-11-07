package p1;
//这是主类
public class TestA{
	//这是主函数
	public static void main(String[]args){
		//for循环先赋值语句，再判断条件，再执行循环体，最后执行语句；
		int sum=0;
		for(int i=1;i<=100;i++){
			sum+=i;
		}
		System.out.println(sum);
	}
}