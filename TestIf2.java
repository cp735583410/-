package a2;
public class TestIf2{
	public static void main(String[]args){
		//���û�����һ������
		System.out.print("������һ������");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
		//������������ż�������ӡ��ż����
		if(i%2==0){
			System.out.println(i+"��ż��");
		}
		//�������ż�������ӡ������
		else{
			System.out.println(i+"������");
		}
	}
}