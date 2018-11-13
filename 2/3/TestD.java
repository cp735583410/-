package p1;
public class TestD{
	public static void main(String[]args){
		a(100);
		System.out.println(a(100));
	}
	//写一个函数定义整型返回值，此函数用于计算100以内所有7的倍数以及 个位数和十位数是7的所有数之和
	public static int a(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			if((i%7==0||i%10==7)||i/10==7){
				sum+=i;
			}
		}
		return sum;
	}
}