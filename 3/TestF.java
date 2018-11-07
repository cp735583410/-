package p1;
//主类
public class TestF{
	//主函数
	public static void main(String[]args){
		//for循环先赋值语句，再判断条件，再执行循环体，最后执行语句；
		for(int i=100;i<1000;i++){
			int a=i%10;
			int b=i/10%10;
			int c=i/100;						
			System.out.println("个位是"+a+"十位是"+b+"百位是"+c);
		}		
	}
}