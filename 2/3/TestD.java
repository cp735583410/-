package p1;
public class TestD{
	public static void main(String[]args){
		a(100);
		System.out.println(a(100));
	}
	//дһ�������������ͷ���ֵ���˺������ڼ���100��������7�ı����Լ� ��λ����ʮλ����7��������֮��
	public static int a(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			if((i%7==0||i%10==7)||i/10==7){
				sum+=i;
			}
		}
		return sum;
	}
}