package p1;
public class TestC{
	public static void main(String[]args){
		add(100);
		//���ظý�����������ô���ӡ
		System.out.println(add(100));
	}
	//дһ�������������ͷ���ֵ���˺������ڼ���100����������֮��
	public static int add(int n){
		int sum=0;
		for(int i=1;i<=100;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		return sum;
	}
}