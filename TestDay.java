package a5;
public class TestDay{
	public static void main(String[]args){
		System.out.print("输入一个整数");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
		switch(i){
			case 1:System.out.println("星期一");break;
			case 2:System.out.println("星期二");break;
			case 3:System.out.println("星期三");break;
			case 4:System.out.println("星期四");break;
			case 5:System.out.println("星期五");break;
			case 6:System.out.println("星期六");break;
			case 7:System.out.println("星期天");break;
			default:System.out.println("输入有误");break;
		}
	}
}