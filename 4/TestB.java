package p1;
public class TestB{
	public static void main(String[]args){
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
	}
	//�κ�һ������6��ż�����ܱ��ֽ�Ϊ���������ĺͣ�Ҫ���������һ������6��ż��
	//��ӡ���ܱ��ֽ�Ϊ�����������ĺ�
	public static void add(int n){
		for(int i=1;i<n;i++){
			int j=n-i;
		}
		if(i<=j ){
			System.out.println(n+"="+i+"+"+j);
		}
	}
	public static boolean a(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				sum++;
			}
		}
		if(sum>2){
			return false;
		}
		else return true;
	}
}