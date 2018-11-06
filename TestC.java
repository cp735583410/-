package p4;
//这是主类
public class TestC{
//主函数
	public static void main(String[]args){
//先输出一个整数为年数				
		System.out.print("请输入年份");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
//如果这个年份能够被4整除，且不能被100整除，咋这一年是闰年		
		if(i%4==0&&i%100!=0){
			System.out.println("闰年");
		}
//如果这个年份能够被100整除，则这个数必须要能被400整除；	
		else if(i%400==0){
			System.out.println("闰年");
		}
		else{
			System.out.println("不是闰年");
		}
	}
}