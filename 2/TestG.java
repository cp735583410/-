package p1;
public class TestG{
	public static void main(String[]args){
		a(15567);	
	}//дһ����������һ�����Ͳ���n���˺����������ڴ�ӡ�ò����Ǽ�λ��
	public static void a(int n){
		int c=1;
		while((n=n/10)!=0){
			c++;
		}
		System.out.println(c);
	}
	
    
}