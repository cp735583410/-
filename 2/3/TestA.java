package p1;
public class TestA{
	public static void main(String[]args){
		add(100);
		System.out.println(add(100));
	}
	//дһ�������������ͷ���ֵ���˺����������ڼ���1~100֮���ż���Ͳ����ظý�����������ô���ӡ
	public static int add(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
			  sum+=i;
			}
		}
		return sum;
	}
	
}