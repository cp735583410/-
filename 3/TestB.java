package p1;
//����
public class TestB{
	//������
	public static void main(String[]args){
		int sum=0;
		//forѭ���ȸ�ֵ��䣬���ж���������ִ��ѭ���壬���ִ�����
		for(int i=1;i<=100;i++){
			if(i%2!=0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}