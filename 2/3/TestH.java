package p1;
public class TestH{
	public static void main(String[]args){
		a(32);
		//���ظý�����������ô���ӡ
		System.out.println(a(32));
	}
	//дһ����������һ�����Ͳ���n���˺������ڼ���1~100֮������n�ı���֮��
	public static int a(int n){
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%n==0){
				sum+=i;
			}
		}
		return sum;
	}
}