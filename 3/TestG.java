package p1;
//����
public class TestG{
	//������
	public static void main(String[]args){
		//forѭ���ȸ�ֵ��䣬���ж���������ִ��ѭ���壬���ִ����䣻
		for(int i=1;i<=100;i++){
			//������7��7�ı������Լ���λ����ʮλ����Ϊ7����������
			if((i%7!=0)&&(i%10!=7&&i/10%10!=7)){
				System.out.println(i);
			}
		}
	}
}