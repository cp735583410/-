package a4;
public class TestIf4{
	public static void main(String[]args){
		//���û�����һ������
		System.out.print("������ɼ�");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
		if(i>=0&&i<60){
			System.out.println("������");
		}
		else if(i>=60&&i<80){
		System.out.println("����");
		}
			else if(i>=80&&i<90){
			System.out.println("����");
			}
				else if(i>=90&&i<=100){
					System.out.println("����");
				}
				else{
					System.out.println("����ɼ�����");
				}
	}
}
