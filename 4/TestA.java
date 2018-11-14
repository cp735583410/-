package p1;
public class TestA{
	public static void main(String[]args){
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		if(n>6&&n%2==0){
			add(n);
		}
		else{
			System.out.println("输入错误");
		}
	}
	//写一个函数定义一个整型参数n，找出哪两个数相加等于n,找出若干种组合方式
	public static void add(int n){
		for(int i=1;i<n;i++){
		    int j=n-i;
			if(i<=j){
				System.out.println(n+"="+i+"+"+j);
			}
	    }
	}	
}