package a3;
public class TestIf3{
	public static void main(String[]args){
		//让用户输入一个整数
		System.out.print("请输入一个整数");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
		//首先判断这个数是否为偶是
		if(i%2==0){
			if(i>6){							
			System.out.println(i+"是大于6的偶数");
			}
			else{
				System.out.println(i+"不是大于6的偶数");
			}
		}
	}
}