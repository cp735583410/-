package p1;
public class TestB{
	public static void main(String[]args){
		int[]a=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		jieshou(a,5);
	}
	//����һ����������һ����������arr����һ������n.�˺������������ж�n�Ƿ��������г��ֹ���������ֹ���ӡ�����±ꡣ
	public static void jieshou(int[]arr,int n){
		for(int i=0;i<arr.length;i++){
			//���ܳ�����������ʱ��
			if(arr[i]==n){
				//��ӡ�±�
				System.out.println(i);
				return;
			}

		}
	}
}