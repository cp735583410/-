package p1;
public class Test{
	public static void main(String[]args){
		int[]a;//����Ķ��� int []a int a[]
		a=new int[5];//Ϊ�������ռ� ָ������ĳ���
		a[0]=5;
		a[1]=6;
		a[2]=7;
		a[3]=8;
		a[4]=9;
		
		//��������
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}
	}
}