package p1;
public class TestF{
	public static void main(String[]args){
		System.out.print("输入一个整数");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
		int a=i;
		for(int n=0;n>=0;n++){
			for(int a;a>0;a+=0){
				if(a<n){
					System.out.println("*");
				}
			}
		}
	}
}
