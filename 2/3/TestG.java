package p1;
public class TestG{
    public static void main(String[]args){
	    a(1000);
		//���ظý�����������ô���ӡ
		System.out.println(a(1000));
    }
	//дһ����������һ�����Ͳ���n���˺������ڴ�ӡ����1~n֮���������֮��
	public static int a(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		return sum;
	}
}