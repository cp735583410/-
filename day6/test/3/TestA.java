package p1;
public class TestA{
	public static void main(String[]args){
		int[] a=new int [4];
		a[0]=20;
		a[1]=21;
		a[2]=22;
		a[3]=23;
		arr(a);
	}
	//����һ�������������������ڱ�����������
	public static void arr(int[]x){
		//������������
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
	}
}