package p1;
public class Test{
	public static void main(String[]args){
		if(a(2)){
			System.out.println("������");
		}
		else {
			System.out.println("��������");
		}
	}
	//дһ������ ����һ�����εĲ���
	public static boolean a(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				sum++;//��n%i=0����ʱ��sum++, ����n����������
			}
		}
		if(sum>2){//��N��������������2ʱ��n������������֮��n Ϊ������
			return false;
		}
		else return true;
	}
}