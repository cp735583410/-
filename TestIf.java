package p1;
public class TestIf{
	public static void main(String[]args){
		//���û�����һ������
		System.out.print("������һ������");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
		//������������ż�������ӡ��ż����
		if(i%2==0){
			System.out.println(i+"��ż��");
		}
		else{
			System.out.println(i+"������");
		}
	}
}