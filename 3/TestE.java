package p1;
//����
public class TestE{
	//������
	public static void main(String[]args){
		int sum=0;
		//forѭ���ȸ�ֵ��䣬���ж���������ִ��ѭ���壬���ִ����䣻
		for(int i=0;i<=100;i++){
			//1~100֮��3�ı����ֲ���5�ı������������ĺ�
			if(i%3==0&&i%5!=0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}