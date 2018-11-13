package p1;
public class TestG{
	public static void main(String[]args){
		a(15567);	
	}//写一个函数接收一个整型参数n，此函数功能用于打印该参数是几位数
	public static void a(int n){
		int c=1;
		while((n=n/10)!=0){
			c++;
		}
		System.out.println(c);
	}
	
    
}