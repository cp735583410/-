package p1;
public class TestE{
	public static void main(String[]args){
		a();
	}
	//����һ�����������ڴ�ӡ1~100֮��7�Լ�7�ı����͸�λ��	ʮλ��Ϊ7��������
	public static void a(){
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%7==0&&i/10%10!=7&&i%10!=7){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}