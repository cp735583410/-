package p1;
public class TestC{
	public static void main(String[]args){
		a(10);
	}
	//дһ����������һ�����Ͳ���n���˺����������ڴ�ӡ1~100֮������n�ı���
	public static void a(int n){
		for(int i=1;i<=n;i++){
			int a=i*i;
		   System.out.print(a+" ");
		}
		System.out.println();
	}
}