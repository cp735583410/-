package p1;
public class TestI{
	public static void main(String[]args){
		a(9);
		//���ظý�����������ô���ӡ
		System.out.println(a(9));
	}
	//дһ����������һ�����Ͳ���n���˺������ڼ�������n������֮��
	public static int a(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		return sum;
	}
}