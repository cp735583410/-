package p1;
//这是主类
public class TestD{
	//主函数
	public static void main(String[]args){
		int sum=0;
		//for循环先赋值语句，再判断条件，再执行循环体，最后执行语句；
		for(int i=1;i<=100;i++){
			//1-100之间3的倍数的所有数之合
			if(i%3==0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}