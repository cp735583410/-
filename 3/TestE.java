package p1;
//主类
public class TestE{
	//主函数
	public static void main(String[]args){
		int sum=0;
		//for循环先赋值语句，再判断条件，再执行循环体，最后执行语句；
		for(int i=0;i<=100;i++){
			//1~100之间3的倍数又不是5的倍数的所有数的和
			if(i%3==0&&i%5!=0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}