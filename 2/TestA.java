package p1;
public class TestA{
	public static void main(String[]args){
		a(100);
	}
	//дһ����������һ�����Ͳ���n���˺����������ڼ���1~n֮������к�
	public static void a(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		System.out.println(sum);
	}
}