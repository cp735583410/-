package p4;
//��������
public class TestC{
//������
	public static void main(String[]args){
//�����һ������Ϊ����				
		System.out.print("���������");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
//����������ܹ���4�������Ҳ��ܱ�100������զ��һ��������		
		if(i%4==0&&i%100!=0){
			System.out.println("����");
		}
//����������ܹ���100�����������������Ҫ�ܱ�400������	
		else if(i%400==0){
			System.out.println("����");
		}
		else{
			System.out.println("��������");
		}
	}
}