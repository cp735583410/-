package p1;
public class TestF{
	public static void main(String[]args){
		a(5);
		//���ظý�����������ô���ӡ
		System.out.println(a(5));
	}
	//дһ����������һ�����Ͳ���n���˺������ڼ���n�Ľ׳�
	public static int a(int n){
		int b=1;
		for(int i=1;i<=n;i++){
			b*=i;
		}
		return b;
	}
}