package p1;
//����
public class TestF{
	//������
	public static void main(String[]args){
		//forѭ���ȸ�ֵ��䣬���ж���������ִ��ѭ���壬���ִ����䣻
		for(int i=100;i<1000;i++){
			int a=i%10;
			int b=i/10%10;
			int c=i/100;						
			System.out.println("��λ��"+a+"ʮλ��"+b+"��λ��"+c);
		}		
	}
}