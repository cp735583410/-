package p1;
public class TestE{
	public static void main(String[]args){
		a(10);
	}
	//дһ����������һ�����Ͳ���n���˺����������ڼ���n����������֮��
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