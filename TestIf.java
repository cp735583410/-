package p1;
public class TestIf{
	public static void main(String[]args){
		//让用户输入一个整数
		System.out.print("请输入一个整数");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
		//如果这个整数是偶数，则打印“偶数”
		if(i%2==0){
			System.out.println(i+"是偶数");
		}
		else{
			System.out.println(i+"是奇数");
		}
	}
}