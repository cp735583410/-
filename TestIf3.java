package a3;
public class TestIf3{
	public static void main(String[]args){
		//���û�����һ������
		System.out.print("������һ������");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
		//�����ж�������Ƿ�Ϊż��
		if(i%2==0){
			if(i>6){							
			System.out.println(i+"�Ǵ���6��ż��");
			}
			else{
				System.out.println(i+"���Ǵ���6��ż��");
			}
		}
	}
}