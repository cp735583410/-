package p1;
public class TestA{
	public static void main(String[]args){
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();
		if(n>6&&n%2==0){
			add(n);
		}
		else{
			System.out.println("�������");
		}
	}
	//дһ����������һ�����Ͳ���n���ҳ�����������ӵ���n,�ҳ���������Ϸ�ʽ
	public static void add(int n){
		for(int i=1;i<n;i++){
		    int j=n-i;
			if(i<=j){
				System.out.println(n+"="+i+"+"+j);
			}
	    }
	}	
}