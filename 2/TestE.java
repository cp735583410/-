package p1;
public class TestE{
	public static void main(String[]args){
		a(10);
	}
	//写一个函数定义一个整型参数n，此函数功能用于计算n的所有因子之和
	public static void a(int n){
		int c=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				c+=i;
			}
		}
		System.out.println(c);
	}
}