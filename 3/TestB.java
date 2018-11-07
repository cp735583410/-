package p1;
//主类
public class TestB{
	//主函数
	public static void main(String[]args){
		int sum=0;
		//for循环先赋值语句，再判断条件，再执行循环体，最后执行语句
		for(int i=1;i<=100;i++){
			if(i%2!=0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}